class Animal
{
    String Name="Animal";
    void Eats()
    {
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal
{
    void Barks()
    {
        System.out.println("Dog Barks");
    }
}
public class Animal1
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        System.out.println(d.Name);
        d.Eats();
        d.Barks();
    }
}