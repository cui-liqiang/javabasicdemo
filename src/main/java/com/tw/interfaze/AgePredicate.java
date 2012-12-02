package com.tw.interfaze;

public class AgePredicate implements Predicate {
    @Override
    public boolean apply(Student object) {
        return object.age < 25;
    }
}
