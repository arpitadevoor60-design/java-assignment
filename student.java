class Student{
    String name;
    int age;
    int marks;
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("maks:"+marks);
    }
    public static void main(String[]args)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="arpita";
        s1.age=20;
        s1.marks=95;
        s2.name="kusuma";
        s2.age=20;
        s2.marks=95;
        s1.display();
        s2.display();
    }
}
