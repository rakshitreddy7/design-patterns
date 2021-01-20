package com.java.builder;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String company;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    public Employee(String name, int age, int salary, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }
}
