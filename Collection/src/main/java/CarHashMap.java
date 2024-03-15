import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarHashMap<K, V> implements CarMap<K,V> {

    private static final int INITIAL_SIZE_ARRAY = 16;
    private static final double LOAD_FACTOR = 0.75;
    Object[] array = new Object[INITIAL_SIZE_ARRAY];

    private class Entry {
        private K key;
        private V value;
        private Entry next;

        public Entry(K key, V value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private int size = 0; //amount elements in Map

    @Override
    public void put(K key, V value) {
        if (size >= array.length * LOAD_FACTOR) {
            increaseArray();
        }
        if (put(key, value, array)) {
            size++;
        };

    }

    private int getElementPosition(K carOwner, int arrayLength) {
        return Math.abs(carOwner.hashCode() % arrayLength);
    }

    public boolean put(K key, V value, Object[] arr) {
        int position = getElementPosition(key, arr.length);
        if (arr[position] == null) {
            arr[position] = new Entry(key, value, null);
            return true;
        } else {
            Entry existedEntry = (Entry) arr[position];
            while (true) {
                if (existedEntry.key.equals(key)) {
                    existedEntry.value = value;
                    return false;
                } else if (existedEntry.next == null) {
                    existedEntry.next = new Entry(key, value, null);
                    return true;
                }
                existedEntry = existedEntry.next;
            }
        }
    }

    @Override
    public V get(K key) {
        int position = getElementPosition(key, array.length);
        Entry existedEntry = (Entry) array[position];
        while (existedEntry != null) {
            if (key.equals(existedEntry.key)) {
                return existedEntry.value;
            } else
                existedEntry = existedEntry.next;
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        Set<K> result = new HashSet<>();
        for (Object entry : array){
            Entry existedEntry = (Entry)entry;
            while (existedEntry != null){
                result.add(existedEntry.key);
                existedEntry = existedEntry.next;
            }
        }
        return result;
    }

    @Override
    public List<V> values() {
        List<V> result = new ArrayList<>() {
        };
        for (Object entry : array){
            Entry existedEntry = (Entry) entry;
            while (existedEntry != null){
                result.add(existedEntry.value);
                existedEntry = existedEntry.next;
            }
        }
        return result;
    }

    @Override
    public boolean remove(K key) {
        int position = getElementPosition(key, array.length);
        Entry existedEntry = (Entry)array[position];
        if (existedEntry != null && key.equals(existedEntry.key)) {
            array[position] = existedEntry.next;
            size--;
            return true;
        } else {
            while (existedEntry != null) {
                if (existedEntry.next == null) {
                    return false;
                }
                if (key.equals(existedEntry.next.key)) {
                    existedEntry.next = existedEntry.next.next;
                    size--;
                    return true;
                } else {
                    existedEntry = existedEntry.next;
                }
            }
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[INITIAL_SIZE_ARRAY];
        size = 0;
    }

    private void increaseArray() {
        Object[] newArray = new Object[array.length * 2];
        for (Object entry : array){
            Entry existedEntry = (Entry)entry;
            while (existedEntry != null){
                put(existedEntry.key, existedEntry.value, newArray);
                existedEntry = existedEntry.next;
            }
        }
        array = newArray;
    }
}
