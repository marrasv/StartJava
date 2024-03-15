public interface CarList<T> extends CarCollection<T>{
    public T get(int index);

    public boolean add(T car);

    public boolean add(T car, int index);

//    boolean contain(T car);
    public boolean removeAt(int index);

    public boolean remove(T car);

    public void clear();

    public int size();

//    public  int getSizeArray();

}
