import java.util.ArrayList;

public class OOP_2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Lisa");
        names.add("Kate");
        names.add("Tolik");
        names.add("Vova");
        ArrayList<Integer> age = new ArrayList<>();
        age.add(47);
        age.add(12);
        age.add(17);
        age.add(43);
        age.add(20);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i< names.size(); i++){
            list.add(names.get(i) + " - " + age.get(i));
        }
        for(String l:list){
            System.out.println(l);
        }
    }
}
