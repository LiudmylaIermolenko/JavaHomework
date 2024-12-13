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
    public static void main(String[] args) {
        // Создаём сотрудников
        Employee emp1 = new Employee("Alice", 1, 6500, 30, false);
        Employee emp2 = new Employee("Bob", 2, 6000, 35, true);
        Employee emp3 = new Employee("Charlie", 3, 4500, 28, true);

        Employee emp4 = new Employee("Diana", 4, 7000, 40, false);
        Employee emp5 = new Employee("Eve", 5, 8000, 45, false);

        // Создаём отделы
        Department dept1 = new Department("IT", 101, 2, new Employee[]{emp1, emp2, emp3});
        Department dept2 = new Department("HR", 102, 3, new Employee[]{emp4, emp5});

        // Создаём компанию
        Company1 company = new Company1(1, "TechCorp", "123 Main St", new Department[]{dept1, dept2});

        // Сотрудник, с которым сравниваем
        Employee targetEmployee = emp1; // Alice

        // Поиск сотрудников с зарплатой выше
        company.findEmployeesWithHigherSalary(targetEmployee);
    }
}




