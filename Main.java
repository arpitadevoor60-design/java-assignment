class Employee {

    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.basicSalary = salary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Permanent Employee
class PermanentEmployee extends Employee {

    double allowance;
    double bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {

        super(id, name, salary);

        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hours, double rate) {

        super(id, name, salary);

        hoursWorked = hours;
        hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return basicSalary + (hoursWorked * hourlyRate);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] e = new Employee[2];

        e[0] = new PermanentEmployee(
                101, "Ravi", 30000, 5000, 3000);

        e[1] = new ContractEmployee(
                102, "Rahul", 20000, 100, 200);

        for (int i = 0; i < e.length; i++) {
            e[i].display();
            System.out.println();
        }
    }
}