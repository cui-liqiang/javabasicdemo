package com.tw.interfaze;

public class NameLengthPredicate implements Predicate {
    private int length;

    public NameLengthPredicate(int length) {
        this.length = length;
    }

    @Override
    public boolean apply(Student object) {
        return object.name.length() < length;
    }
}
