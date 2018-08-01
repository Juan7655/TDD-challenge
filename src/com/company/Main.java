package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    static List sort(List<Integer> unordered) {
        List<Integer> l1 = unordered.subList(0, unordered.size()/2),
                l2 = unordered.subList(unordered.size()/2, unordered.size());

        if(l1.size() == 0) return l2;

        l1 = sort(l1);
        l2 = sort(l2);

        return merge(l1, l2);
    }

    private static List merge(List<Integer> l1, List<Integer> l2) {
        int pointer1 = 0, pointer2 = 0;
        List<Integer> orderedList = new ArrayList<>();

        while(true){
            if(l1.get(pointer1) > l2.get(pointer2))  orderedList.add(l2.get(pointer2++));
            else orderedList.add(l1.get(pointer1++));

            if(pointer1 == l1.size()){
                orderedList.addAll(l2.subList(pointer2, l2.size()));
                break;
            }
            if(pointer2 == l2.size()){
                orderedList.addAll(l1.subList(pointer1, l1.size()));
                break;
            }
        }

        return orderedList;
    }
}
