class Book
{
    String Title;
    String Author;
    double Price;
    static int Bookcount=0;
    Book(String Title,String Author,double Price)
    {
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
        Bookcount++;
    }
    void display()
    {
        System.out.println("Title:"+Title);
        System.out.println("Author:"+Author);
        System.out.println("Price:RS"+Price);

    }
    static void displaycount()
{
    System.out.println("Totalbooks:"+Bookcount);
}
public static void main(String[]args)
{
    Book b1=new Book("java","james",350);
    Book b2=new Book("python","guido",400);
    Book b3=new Book("c programming","demic",300);
    b1.display();
    System.out.println();
    b2.display();
    System.out.println();
    b3.display();
}
}
