class Person1 {
    String Name;
    Person1(String Name)
    {
        this.Name=Name;
    }
    void displayPerson1()
    {
        System.out.println("Name:"+Name);
    }
}
class Emoplye extends Person1{
    int EmpolyeId;
    Emoplye(String Name, int EmoplyeId)
    {
        super(Name);
        this.EmpolyeId=EmoplyeId;
    }
    void displayEmpolyeId()
    {
        System.out.println("EmoplyeId:"+EmpolyeId);
    }
}
class Manger extends Emoplye{
    String Department;
    Manger(String Name,int EmpolyeId,String Department) {
        super(Name, EmpolyeId);
        this.Department = Department;
    }
    void displayManger()
    {
        System.out.println("Department:"+Department);
    }

    public static void main(String[] args)
    {
        Manger M=new Manger("Arpita",101,"datascience");
        M.displayManger();
        M.displayEmpolyeId();
        M.displayPerson1();
    }
}

