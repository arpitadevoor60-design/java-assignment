class Student6{
    private String Name;
    private int Age;
    private double Marks;
    private int id;
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        if(id>0){
            this.id=id;
        }
        else {
            System.out.println("invalid");
        }
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        if(Age>=15&&Age<=30)
        {
            this.Age=Age;
        }
        else
        {
            System.out.println("invalid Age");
        }
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        if(Name!="Null&&!Name.isempty()")
        {
            this.Name=Name;
        }
        else
        {
            System.out.println("invalid Name");
        }
    }
    public double getMarks()
    {
        return Marks;
    }
    public void setMarks(double Marks)
    {
        if(Marks>0&& Marks<=100)
        {
            this.Marks=Marks;
        }
        else {
            System.out.println("fail");
        }
    }
    public static void main(String[]args)
    {
        Student6 s=new Student6();
        s.setAge(20);
        s.setid(104);
        s.setName("akash");
        s.setMarks(100);
        System.out.println("id:"+s.getid());
        System.out.println("Name:"+s.getName());
        System.out.println("Age:"+s.getAge());
        System.out.println("Marks:"+s.getMarks());
    }

}
