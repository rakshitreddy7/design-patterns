package com.java.factory;

public class Client {
    public static void main(String[] args) {
        OperationSystemFactory factory = new OperationSystemFactory();
        OperatingSystem os = factory.getOs("sleek");
        String description = os.getDescription();
        System.out.println(description);
    }
}
