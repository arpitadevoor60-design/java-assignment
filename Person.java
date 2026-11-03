 class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Person Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {

    int employeeId;
    double basicSalary;

    Employee(String name, int age, int id, double salary) {

        super(name, age);

        employeeId = id;
        basicSalary = salary;

        System.out.println("Employee Constructor");
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {

    String department;
    double bonus;

    Manager(String name, int age, int id,
            double salary, String department, double bonus) {

        super(name, age, id, salary);

        this.department = department;
        this.bonus = bonus;

        System.out.println("Manager Constructor");
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }

    public static void main(String[] args) {

        Manager m = new Manager(
                "Arun", 30, 101, 40000, "IT", 10000);

        System.out.println("\nManager Details:");

        m.display();
    }
}

