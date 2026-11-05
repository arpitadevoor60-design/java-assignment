class Person {
    String Name;
    Person(String Name)
    {
        this.Name=Name;
    }
}
class Student extends Person{
    int rollno;
    Student(String Name,int rollno)
    {
        super(Name);
        this.rollno=rollno;
    }
    void display()
    {
        System.out.println("Name:"+Name);
        System.out.println("rollno:"+rollno);
    }
}
public class  Main {
    public static void main(String[]args)
    {
        Student S = new Student("arpita", 101);
        S.display();
    }
}