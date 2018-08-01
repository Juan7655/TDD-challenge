package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    static List sort(List<Integer> unordered){
        List<Integer> ordered = new ArrayList<>();

        if(unordered.size() == 0) return ordered;
        ordered.add(unordered.get(0));

        for (int i=1; i < unordered.size(); i++)
            for (int j = 0; j < ordered.size(); j++) {
                if (unordered.get(i) <= ordered.get(j)) {
                    ordered.add(j, unordered.get(i));
                    break;
                }
                if(j == ordered.size()-1){
                    ordered.add(unordered.get(i));
                    break;
                }
            }

        return ordered;
    }
}
