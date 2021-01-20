package com.java.singleton.lazy;

public class SingletonDPLazy {
    public static void main(String[] args) {
        Test test1 = Test.getInstance();
        Test test2 = Test.getInstance();
    }
}

class Test {
    private static Test test;

    private Test() {
        System.out.println("Test object is created..");
    }

    public static Test getInstance() {
        if (test == null) {
            test = new Test();
        }
        return test;
    }
}
