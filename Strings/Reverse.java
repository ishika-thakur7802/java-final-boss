//Reverse a string without using built-in reverse methods.
import java.io.*;
class Reverse{
    public static void main(String[] args)
    {
        String name= "Anne";
        String reversed="";
        for(int i=name.length()-1; i>=0; i--)
        {
            reversed= reversed+name.charAt(i);
        }

        System.out.println(reversed);
    }
}