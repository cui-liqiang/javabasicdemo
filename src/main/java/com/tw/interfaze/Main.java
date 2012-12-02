package com.tw.interfaze;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1234", 24);
        Student student2 = new Student("123456", 34);

        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);

        Predicate namePredicate = new NameLengthPredicate(10);
        Predicate agePredicate = new AgePredicate();

        System.out.println(Filters.filter(students, namePredicate));
        System.out.println(Filters.filter(students, agePredicate));
    }
}
