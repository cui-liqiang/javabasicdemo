package com.tw.arrays;

import org.junit.Test;

public class Array {
    @Test
    public void dynamicallyAllocate() {
        int length = 10;
        String[] strings = new String[length];
        strings[0] = "sample";
    }

    @Test
    public void simplerWayToInitializeArray() {
        String[] strings = new String[]{"123", "234"};
    }

    @Test
    public void lengthAttributeOfArray() {
        String[] strings = new String[]{"123", "234"};
        System.out.println(strings.length); // -> 2
    }

    @Test
    public void testOutOfBounds() {
        int i = (new int[9])[9];
    }
}
