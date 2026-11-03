
class Bankaccount {
    private double Balance;

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void displayBalance() {
        if (Balance <= 0) {
            System.out.println("error:ypu don't have any balance in your account");
        } else {
            System.out.println("Account Balance:"+Balance);

        }
    }
    public static void main(String[] args)
    {
        Bankaccount account=new Bankaccount();
        account.setBalance(-500);
        account.displayBalance();
    }
}
