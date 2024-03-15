package StepikCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListBasic2_1 {
    static List<String> changeList1(List<String> list) {
        Collections.fill(list, Collections.max(list, Comparator.comparingInt(String::length)));
        return list;

//        String maxString = Collections.max(list, Comparator.comparingInt(String::length));

//        String maxString = Collections.max(list, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

//        String maxString = Collections.max(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        })      ;
//        Collections.fill(list, maxString);
//        return list;
    }

    static List<String> changeList(List<String> list) {
        String maxString = "";
        int count = 0;
        for (String s : list) {
            if (s.length() > maxString.length()) {
                maxString = s;
            }
            count++;
        }
        List<String> b = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            b.add(maxString);
        }
        return b;
    }

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("hi");
        l.add("hello");
        l.add("goodmorning");
        l.add("ass");
        System.out.println(l);
        List<String> a = changeList1(l);
        System.out.println(a);

    }
}
