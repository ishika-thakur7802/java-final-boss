//Check whether a string is a palindrome.
//• Words: level, radar, kayak, noon, Malayalam
class Palindrome{
    public static void main(String [] args)
    {
        String word="Kayak";
        String lowerWord=word.toLowerCase();

        String reverse="";

        for(int i=lowerWord.length()-1; i>=0; i--)
        {
            reverse= reverse+lowerWord.charAt(i);
        }
        if(reverse.equals(lowerWord))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}