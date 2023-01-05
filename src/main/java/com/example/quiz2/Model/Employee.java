package com.example.quiz2.Model;

public class Employee {
    private String Name;
    private int Salary;

    public Employee(String name, int salary) {
        Name = name;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
