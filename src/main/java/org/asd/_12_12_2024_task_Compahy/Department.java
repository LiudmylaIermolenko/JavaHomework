package org.asd._12_12_2024_task_Compahy;

public class Department {
    private String name;
    private int id;
    private Employee[] employees;

    public Department(String name, int countEmp, int id, Employee[] employees) {
        this.name = name;
        this.id = id;
        this.employees = employees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
