package org.asd._12_12_2024_task_Compahy;

public class Company1 {
    private int id;
    private String name;
    private String address;
    private Department[] departments;

    public Company1(int id, String name, String address, Department[] departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    // Метод: Найти сотрудников с зарплатой больше, чем у указанного сотрудника
    public void findEmployeesWithHigherSalary(Employee targetEmployee) {
        System.out.println("Сотрудники с зарплатой выше, чем у " + targetEmployee.getName() + " (" + targetEmployee.getSalary() + "):");

        // Перебираем отделы компании
        for (int i = 0; i < departments.length; i++) {
            Department department = departments[i];

            // Перебираем сотрудников отдела
            for (int j = 0; j < department.getEmployees().length; j++) {
                Employee employee = department.getEmployees()[j];

                if (employee.getSalary() > targetEmployee.getSalary()) {
                    System.out.println("Отдел: " + department.getName() + ", Сотрудник: " + employee.getName() + ", Зарплата: " + employee.getSalary());
                }
            }
        }
    }

}




