import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CarHashSet<T> implements CarSet<T> {
    private final Map<T, Object> map = new HashMap<>();
    private Object object = new Object();

    @Override
    public boolean add(T car) {
        if (map.containsKey(car)) {
            return false;
        }
        map.put(car, object);
        return true;
    }

    @Override
    public boolean remove(T car) {
        Object removed = map.remove(car);
        return removed != null;
    }

    @Override
    public boolean contain(T car) {
        return map.containsKey(car);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }
//    private static final int INITIAL_CAPACITY = 16;
//    private static final double LOAD_FACTOR = 0.75;
//    private Object[] array = new Object[INITIAL_CAPACITY];
//    private int size = 0;
//
//    @Override
//    public boolean add(T car) {
//        if (size > array.length * LOAD_FACTOR) {
//            increaseArray();
//        }
//        if (add(car, array)) {
//            size++;
//            return true;
//        }
//        return false;
//    }
//
//    private boolean add(T car, Object[] arr) {
//        int position = getElementPosition(car, arr.length);
//        if (arr[position] == null) {
//            arr[position] = new Entry(car, null);
//            return true;
//        } else {
//            Entry entryExist = (Entry) arr[position];
//            while (true) {
//                if (entryExist.value.equals(car)) {
//                    return false;
//                }
//                if (entryExist.next != null) {
//                    entryExist = entryExist.next;
//                } else {
//                    entryExist.next = new Entry(car, null);
//                    return true;
//                }
//            }
//        }
//    }
//
//    @Override
//    public boolean remove(T car) {
//        int position = getElementPosition(car, array.length);
//        Entry entryExist = (Entry)array[position];
//        while (entryExist != null) {
//            if (entryExist.value.equals(car)) {
//                array[position] = entryExist.next;
//                size--;
//                return true;
//            } else {
//                entryExist = entryExist.next;
//            }
//        }
//        return false;
//    }
//
////
//
////    @Override
////    public boolean contain(T car) {
////        int position = getElementPosition(car, array.length);
////        for (Entry entry: array){
////            Entry  existedElement = entry;
////            while (existedElement != null) {
////                if (entry.value.equals(car)) {
////                    return true;
////                } else {
////                    existedElement = existedElement.next;
////                }
////            }
////        }
////        return false;
////    }
//
//    @Override
//    public boolean contain(T car) {
//        int position = getElementPosition(car, array.length);
//        Entry existedElement = (Entry)array[position];
//        if (existedElement != null) {
//            if (existedElement.value.equals(car)) {
//                return true;
//            } else {
//                existedElement = existedElement.next;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    @Override
//    public void clear() {
//        array = new Object[INITIAL_CAPACITY];
//        size = 0;
//
//    }
//
//    public void increaseArray() {
//        Object[] newArray = new Object[array.length * 20];
//        for (Object entry : array) {
//            Entry existedElement = (Entry)entry;
//            while (existedElement != null) {
//                add(existedElement.value, newArray);
//                existedElement = existedElement.next;
//            }
//        }
//        array = newArray;
//    }
//
//    public int getElementPosition(T car, int arrayLength) {
//        return Math.abs(car.hashCode() % arrayLength);
//    }
//
//    private class Entry {
//
//        private T value;
//        private Entry next;
//
//        public Entry(T value, Entry next) {
//            this.value = value;
//            this.next = next;
//        }
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return new Iterator<T>() {
//            int index = 0;
//            int pos = 0;
//            Entry entry = entryNextPosition();
//
//            @Override
//            public boolean hasNext() {
//                return index < size;
//            }
//
//            @Override
//            public T next() {
//                    T car = entry.value;
//                    if (entry.next == null) {
//                        entry = entryNextPosition();
//                    } else {
//                        entry = entry.next;
//                    }
//                    index++;
//                    return car;
//            }
//
//            private Entry entryNextPosition() {
//                    for (int i = pos; i < array.length; i++) {
//                        if (array[i] != null) {
//                            pos = i + 1;
//                            return (Entry)array[i];
//                        }
//                    }
//                return null;
//            }
//        };
//    }
}
