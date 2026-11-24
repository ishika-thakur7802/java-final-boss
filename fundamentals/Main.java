class Main{
    public static void main(String[] args)
    {
        EmailNotification n = new EmailNotification();
        n.notify();

        SMSNotification n1= new SMSNotification();
        n1.notify();
    }
}