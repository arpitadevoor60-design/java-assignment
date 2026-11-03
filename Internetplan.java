class Internetplan
{
    String Planname;
    int Data;
    double Price;
    Internetplan()
    {
        this("basic",1,199);
    }
    Internetplan(String Planname,int Data)
    {
        this(Planname,Data,299);
    }
    Internetplan(String Planname,int Data,double Price)
    {
        this.Planname=Planname;
        this.Data=Data;
        this.Price=Price;
    }
    void display()
    {
        System.out.println("Planname:"+Planname);
        System.out.println("Data:"+Data+"GB");
        System.out.printf("Price:RS"+Price);
    }
    public static void main(String[]args)
    {
        Internetplan p1=new Internetplan();
        Internetplan p2=new Internetplan("Standard",2);
        Internetplan p3=new Internetplan("premium",5,499);
        p1.display();
        p2.display();
        p3.display();
    }
}
