public class Factorial {
//    USING FOR LOOP
//    public int factorial (int a)
//    {
//        int f=1;
//        for (int i=1; i<=a; i++)
//        {
//            f= i*f;
//        }
//        return f;
//    }
//    public static void main (String[] args){
//        Factorial f = new Factorial();
//        System.out.println(f.factorial(5));
//    }
    //USING RECURSION
    public int factorial(int a)
    {
        //base condition
        if(a==0) return 1;
        //recursive relation
        return a*factorial(a-1);
    }
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
    }
}