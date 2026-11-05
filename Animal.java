class Animal {
    void Sound()
    {
        System.out.println("Animal makes Sound");
    }
}
class Cat extends Animal
{
    void Sound()
    {
        System.out.println("cat meow");
    }
    public static void main(String[] args)
    {
        Cat C=new Cat();
        C.Sound();
    }
}
