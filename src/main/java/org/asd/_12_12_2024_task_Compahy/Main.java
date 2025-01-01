package org.asd._12_12_2024_task_Compahy;

public class Main {
    public static void main(String[] args) {
        // Создаём сотрудников
        Employee emp1 = new Employee("Alice", 1, 6500, 30, false);
        Employee emp2 = new Employee("Bob", 2, 6000, 35, true);
        Employee emp3 = new Employee("Charlie", 3, 4500, 28, true);

        Employee emp4 = new Employee("Diana", 4, 7000, 40, false);
        Employee emp5 = new Employee("Eve", 5, 8000, 45, false);

        // Создаём отделы
        Employee[] employees = new Employee[]{emp1, emp2, emp3};
        Department dept1 = new Department("IT", 101, 2, employees);
        Department dept2 = new Department("HR", 102, 3, new Employee[]{emp4, emp5});

        // Создаём компанию
        Company1 company = new Company1(1, "TechCorp", "123 Main St", new Department[]{dept1, dept2});

        // Сотрудник, с которым сравниваем
        Employee targetEmployee = emp1; // Alice

        // Поиск сотрудников с зарплатой выше
        company.findEmployeesWithHigherSalary(targetEmployee);
    }
}
