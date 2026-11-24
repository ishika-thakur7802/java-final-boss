class UPIPayment extends Payment{
    void pay(double amount)
    {
        System.out.println("Paid by UPI="+amount);
    }

    public static void main(String[] args)
    {
        UPIPayment p= new UPIPayment();
        p.pay(7000);
    }
}