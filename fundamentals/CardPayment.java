class CardPayment extends Payment{
    void pay(double amount)
    {
        System.out.println("Paid by Card="+amount);
    }

    public static void main(String[] args)
    {
        CardPayment p1= new CardPayment();
        p1.pay(70000);
    }
}