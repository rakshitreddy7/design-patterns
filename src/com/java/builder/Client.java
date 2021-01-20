package com.java.builder;

public class Client {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.setName("Reddy");
        builder.setAge(28);

        Employee employee = builder.getEmployee();

        System.out.println(employee);
    }
}
