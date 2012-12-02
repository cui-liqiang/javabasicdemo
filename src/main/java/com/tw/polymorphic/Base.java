package com.tw.polymorphic;

abstract public class Base {
    public void process() {
        doFirst();
        doSecond();
        doLast();
    }

    abstract protected void doFirst();
    abstract protected void doSecond();
    abstract protected void doLast();

    public static void main(String[] args) {
        Base child = new Child();
        child.process();
    }
}
