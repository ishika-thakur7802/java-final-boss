//Create a BankAccount class with account holder, account number and balance.
//Add deposit and withdraw methods.

class BankAccount{
    String accHolderName;
    long accNumber;
    double balance;
    BankAccount(String accHolderName, long accNumber, double balance)
    {
        this.accHolderName= accHolderName;
        this.accNumber= accNumber;
        this.balance= balance;
    }
    void deposit(double amount)
    {
        this.balance+=amount;
        System.out.println("Updated Balance of"+this.accHolderName+"="+this.balance);
    }
    void withdraw(double amount)
    {
        this.balance-=amount;
        System.out.println("Updated Balance of"+this.accHolderName+"="+this.balance);
    }
    public static void main(String[] args)
    {
        BankAccount acc1= new BankAccount("Aren", 1233445612341031L, 7800000);
        BankAccount acc2= new BankAccount("Bren", 123899679011031L, 9800000);
        BankAccount acc3= new BankAccount("Darcy", 124445679011031L, 2800000);

        acc2.deposit(200000);
        acc3.withdraw(100000);
    }
}