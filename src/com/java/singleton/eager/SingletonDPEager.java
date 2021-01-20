package com.java.singleton.eager;

public class SingletonDPEager {

    public static void main(String[] args) {
        Test test1 = Test.newInstance();
        Test test2 = Test.newInstance();
    }
}

class Test {
    private static final Test test = new Test();

    private Test() {
        System.out.println("Test instance created..");
    }

    public static Test newInstance() {
        return test;
    }
}
