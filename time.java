class Time
{
    int Hours;
    int Mintes;
    int Seconds;
    Time(int Seconds)
    {
        this.Seconds=Seconds;
        this.Hours=0;
        this.Mintes=0;
    }
    Time(int Seconds,int Mintes)
    {
        this.Seconds=Seconds;
        this.Mintes=Mintes;
        this.Hours=0;
    }
    Time(int Seconds,int Mintes,int Hours)
    {
        this.Seconds=Seconds;
        this.Mintes=Mintes;
        this.Hours=Hours;
    }
    void display()
    {
        System.out.println(Hours+":"+Mintes+":"+Seconds);
    }
    public static void main(String[]args)
    {
        Time t1=new Time(45);
        Time t2=new Time(11,20);
        Time t3=new Time(11,20,3);
        t1.display();
        t2.display();
        t3.display();
    }
}