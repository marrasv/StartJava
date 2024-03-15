package example;

public class MyArrayList {
    private String[] employee = new String[10];
    private int size = 0;

    public String getName(int index){
        return employee[index];
    }
    public void add(String name){
        employee[size] = name;
        size ++;
        if (size == employee.length){
            String[] array = new String[2 * employee.length];
            for (int i = 0; i < employee.length; i++){
                array[i] = employee[i];
            }
            employee = array;
        }
    }

    public void remove(int index){
        for (int i = index; i < employee.length-1; i ++){
            employee[i] = employee[i+1];
        }
        employee[size] = null;
        size --;
    }

    public void remove(String name){
        for (int i = 0; i < employee.length; i++){
            if (employee[i] == name){
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
