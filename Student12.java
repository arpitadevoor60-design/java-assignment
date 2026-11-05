 class Student12 {
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
    public void setAge(int Age)
    {
        this.Age=Age;
    }
    public static void main(String[] args)
    {
        Student12 S=new Student12();
        S.setName("Arpita");
        S.setAge(19);
        System.out.println(S.getName());
        System.out.println(S.getAge());
    }
}
