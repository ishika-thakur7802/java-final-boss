//Find the frequency of every character in a string.

class Frequency{
    public static void main(String[] args)
    {
        String s= "A man is forty four years old";
        for(int i=0; i<s.length(); i++)
        {
            int freq=0;
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    freq+=1;
                }
            }
            System.out.println(s.charAt(i)+"="+freq);

        }
    }
}