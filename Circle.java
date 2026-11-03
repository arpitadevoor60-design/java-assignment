class Circle{
    double radius;
    void calculatearea()
    {
        double area=Math.PI*radius*radius;
        System.out.println("area of Circle:"+ area);
    }
    void circumference()
    {
        double circumference=2*Math.PI*radius;
        System.out.println(" circumference of Circle:"+circumference);
    }
    public static void main(String[]args){
        Circle c=new Circle();
        c.radius=7;
        c.calculatearea();
        c.circumference();

    }
}
