class Student4 {
    private String Name;
    private int Age;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getAge()
    {
        return Age;
    }
    public void  setAge(int Age)
    {
        this.Age=Age;
    }
    public static void main(String[] args)
    {
        Student4 s=new Student4();
        s.setName("akash");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
