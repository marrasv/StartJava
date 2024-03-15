import java.util.Iterator;

public class CarLinkedList<T> implements CarList<T>, CarQueue<T> {

    private class Node {
        private Node previous;
        private T value;
        private Node next;

        public Node(Node previous, T value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public T get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(T car) {
        if (size == 0) {
            first = new Node(null, car, null);
            last = first;
        } else {
            Node node = new Node(last, car, null);
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(T car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(car);
        } else {
            Node nodeNext = getNode(index);
            Node nodePrevious = nodeNext.previous;
            Node node = new Node(nodePrevious, car, nodeNext);
            nodeNext.previous = node;
            if (nodePrevious != null) {
                nodePrevious.next = node;
            } else {
                first = node;
            }
            size++;
        }
        return true;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == 1) {
            clear();
            return true;
        }
        if (index == 0) {
            first = first.next;
            first.previous = null;
        } else if (index == size - 1) {
            last = last.previous;
            last.next = null;
        } else {
            Node nodeRemove = getNode(index);
            nodeRemove.previous.next = nodeRemove.next;
            nodeRemove.next.previous = nodeRemove.previous;
        }
        size--;
        return true;
    }

    @Override
    public boolean remove(T car) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(car)) {
                return removeAt(i);
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public int getSizeArray() {
//        return size;
//    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public boolean contain(T car) {
        Node node = first;
        for (int i = 0; i < size; i++){
            if (node.value.equals(car)){
                return true;
            } else {
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node node = first;
            @Override
            public boolean hasNext() {
                return node!=null;
            }

            @Override
            public T next() {
                T car = node.value;
                node = node.next;
                return car;
            }
        };
    }

    @Override
    public T peek() {
//        return size > 0 ? get(0) : null;
        return first.value;
    }

    @Override
    public T poll() {
        T car = first.value;
        remove(car);
        return car;
    }
}
