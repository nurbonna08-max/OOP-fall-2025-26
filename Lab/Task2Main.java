package Lab;

class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return title + " | Salary: " + salary;
    }
}

class Employee {
    private String name;
    private Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int capacity) {
        this.companyName = companyName;
        employees = new Employee[capacity];
    }

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count] = e;
            count++;
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Employees:");

        for (int i = 0; i < count; i++) {
            System.out.println(" - " + employees[i].getName()
                    + " | Position: " + employees[i].getPosition());
        }
    }
}

public class Task2Main {
    public static void main(String[] args) {

        Company company = new Company("TechSoft Ltd.", 3);

        company.addEmployee(new Employee("John",
                new Position("Manager", 60000)));

        company.addEmployee(new Employee("Sara",
                new Position("Developer", 45000)));

        company.addEmployee(new Employee("Leo",
                new Position("Designer", 40000)));

        company.showEmployees();
    }
}
