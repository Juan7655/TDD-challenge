package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void sort() {
        List<Comparable> expected = new ArrayList<>();
        Integer[] unordered = new Integer[20];


        for(int i=0; i < 20; i++){
            expected.add(i);
            unordered[(2+i*3)%20] = i;
        }

        List actual = Main.sort(Arrays.asList(unordered));
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sort2() {
        List<Comparable> expected = new ArrayList<>();
        Integer[] unordered = new Integer[40];


        for(int i=0; i < 40; i++){
            expected.add(i);
            unordered[(2+i*3)%40] = i;
        }
        String str = "";
        for(int i:unordered) str += i + ", ";
        //System.out.println(str);
        List actual = Main.sort(Arrays.asList(unordered));
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sort3() {
        List<Comparable> expected = new ArrayList<>();
        Integer[] unordered = new Integer[0];


        List actual = Main.sort(Arrays.asList(unordered));
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sort4() {
        List<Comparable> expected = new ArrayList<>();
        Integer[] unordered = new Integer[20];


        for(int i=0; i < 20; i++){
            expected.add(5);
            unordered[(2+i*3)%20] = 5;
        }

        List actual = Main.sort(Arrays.asList(unordered));
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sort5() {
        List<Comparable> expected = new ArrayList<>();
        Integer[] unordered = new Integer[20];


        for(int i=0; i < 20; i++){
            expected.add(i);
            unordered[19-i] = i;
        }
        List<Integer> input = Arrays.asList(unordered);
        List actual = Main.sort(input);
        assertEquals(expected, actual);
    }
}