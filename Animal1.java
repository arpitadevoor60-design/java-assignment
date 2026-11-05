 class Animal1 {
    String Name;
    Animal1(String Name)
    {
        this.Name=Name;
    }
    void Eat()
    {
        System.out.println("Name:"+"Eat");
    }
}
class Dog extends Animal1 {
    String breed;

    Dog(String Name) {
        super(Name);
        this.breed = breed;
    }

    void bark() {
        System.out.println("Name:" + "bark");
    }

    void display() {
        System.out.println("Name:" + super.Name);
        System.out.println("Breed:" + breed);
        super.Eat();
        bark();
    }

    public static void main(String[] args)
    {
        Dog d=new Dog("tommay");
        d.display();
    }
}
