class Point
{
    int X,Y;
    Point(int X,int Y)
    {
        this.X=X;
        this.Y=Y;

    }
    void display()
    {
        System.out.println("Point:("+X+","+Y+")");
    }
    public static void main(String[]args)
    {
        Point p=new Point(10,20);
        p.display();
    }
}
