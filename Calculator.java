class Calculator
{
    int calculate(int a,int b)
    {
        return a+b;
    }
    double calculate(double a,double b)
    {
        return a*b;
    }
    int calculate(int a,int b,int c)
    {
        return Math.max(a,Math.max(b,c));

    }
    double calculate(int a,double b)
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        System.out.println("sum:"+c.calculate(10,20));
        System.out.println("product:"+c.calculate(2.5,2));
        System.out.println("maximum number:"+c.calculate(10,20,100));
        System.out.println("diffrence:"+c.calculate(10,5));
    }

}
