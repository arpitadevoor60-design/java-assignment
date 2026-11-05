 class Vehicle {
    Vehicle()
    {
        System.out.println("Vehicle Construction");
    }
}
class Car extends Vehicle{
    Car()
    {
        super();
        System.out.println("Car Constructor");
    }
    public static void main(String[] args)
    {
        Car C=new Car();
    }
}