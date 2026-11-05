class BankAccount {
    private  double balance;
    public BankAccount(double balance)
    {
        this.balance=balance;
    }
    public void display_balance()
    {
        if(balance<0)
        {
            System.out.println("error:you dont have any balance in your account");
        }
        else {
            System.out.println("Account balance:"+balance);
        }
    }
    public static void main(String[] args)
    {
        BankAccount b1=new BankAccount(50000);
        b1.display_balance();
        BankAccount b2=new BankAccount(-100);
        b2.display_balance();

    }
}
