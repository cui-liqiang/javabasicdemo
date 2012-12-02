package com.tw.interfaze;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public static List<Student> filter(List<Student> students, Predicate predicate) {
        ArrayList<Student> students1 = new ArrayList<Student>();
        for (Student student : students) {
            if(predicate.apply(student)) students1.add(student);
        }
        return students1;
    }
}
