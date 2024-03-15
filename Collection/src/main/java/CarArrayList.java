import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarArrayList<T> implements CarList<T> {
    private Object[] array = new Object[10];
    private int size = 0;

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public boolean add(T car) {
        increaseArray();
        array[size] = car;
        size ++;
        return true;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }

    @Override
    public void clear() {
        array = new Object[10];
        size = 0;

    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        System.arraycopy(array,index+1,array,index, size - index-1);
        array[size] = null;
        size --;
        return true;
    }

    @Override
    public boolean remove(T car) {
        for (int i = 0; i < size; i++){
            if (array[i].equals(car)){
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSizeArray(){
        return array.length;

    }

    public boolean add(T car, int index){
        increaseArray();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array,index,array,index+1, size - index);
//        for (int i = size; i > index; i--){
//            array[i] = array[i - 1];
//        }
        array[index] = car;
        size ++;
        return true;
    }

    private void increaseArray(){
        if (array.length == size) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    @Override
    public boolean contain(T car) {
        for (int i = 0; i < size; i++){
            if (array[i].equals(car)){
                return true;
            }
        }
        return false;
    }
}
