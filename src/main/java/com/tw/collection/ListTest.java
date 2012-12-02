package com.tw.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    @Test
    public void listBasic() {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.get(2);
    }

    @Test
    public void iteratorTest() {
        List<String> list = new ArrayList<String>();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
