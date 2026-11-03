class Student2{
    String name;
    int age;
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
public static void main(String[]args)
{
    Student2 s1=new Student2();
    s1.name="arpita";
    s1.age=19;
    s1.display();
}