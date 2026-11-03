 class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Parent Brand: " + brand);
    }
}

class Car extends Vehicle {

    String brand;

    Car(String parentBrand, String childBrand) {

        super(parentBrand);

        this.brand = childBrand;
    }

    @Override
    void display() {

        super.display();

        System.out.println("Child Brand: " + brand);
    }
    public static void main(String[] args) {

        Car c = new Car("Toyota", "BMW");

        c.display();
    }
}
