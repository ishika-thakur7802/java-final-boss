public class Max {
    static int a;
    static int b;
    public static int max (int a, int b)
    {
        if(a>b) return a;
        else return b;
    }
    public static void main (String[] args)
    {
        System.out.print ("Greater number is:");
        System.out.println (max(5,10));
    }
}