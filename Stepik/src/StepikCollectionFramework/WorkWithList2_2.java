package StepikCollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WorkWithList2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = new ArrayList<>();
        ArrayList<Integer> div3list  = new ArrayList<>();
        ArrayList<Integer> otherlist = new ArrayList<>();
        //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists
        for (Integer i : bigList) {
            if (i % 2 == 0) {
                div2list.add(i);
            }
            if (i % 3 == 0) {
                div3list.add(i);
            } else if (i % 2 != 0){
                otherlist.add(i);
            }
        }
        div2list.sort((o1, o2) -> o1 - o2);
        div3list.sort((o1, o2) -> o1 - o2);
        otherlist.sort((o1, o2) -> o1 - o2);
        //get result list from createListOfLists
        List<List<Integer>> resultList;
        System.out.println(createListOfLists(div2list, div3list, otherlist));
        //call printInLine() for resultList
//        printInLine(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<Integer>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
            bigList.add(Integer.parseInt(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
        List<List<Integer>> result = new ArrayList<>();
        result.add(div2list);
        result.add(div3list);
        result.add(otherList);
        return result;
    }
}
