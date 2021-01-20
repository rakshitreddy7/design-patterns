package com.java.builder;

public class EmployeeBuilder {
    private String name;
    private int age;
    private int salary;
    private String company;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public Employee getEmployee() {
        return new Employee(name, age, salary, company);
    }
}
