package com.java.singleton.threadsafety;

public class SingletonDPSynchronized {
    public static void main(String[] args) {
       Thread thread1 = new Thread(() -> {
           Test test1 = Test.getInstance();
       });

        Thread thread2 = new Thread(() -> {
            Test test2 = Test.getInstance();
        });

        thread1.start();
        thread2.start();
    }
}

class Test {
    private static Test test;

    private Test() {
        System.out.println("Test object is created..");
    }

    public static synchronized Test getInstance() {
        if (null == test) {
            test = new Test();
        }
        return test;
    }
}
