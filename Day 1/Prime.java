public class Prime{
    public boolean isPrime(int a)
    {
        int count=0;
        for(int i=1; i<=a; i++)
        {
            if(a%i==0) {
                count++;
            }
            else continue;
        }
        if(count==2) return true;
        else return false;
    }
    public static void main (String[] args)
    {
        Prime p = new Prime();
        System.out.println(p.isPrime(15));
    }
}