//Count vowels, consonants, digits and spaces in a string.

class Count{
    public static void main(String[] args)
    {
        String s= "A man is 49 years old";
        int cv=0;
        int cc=0;
        int cd=0;
        int cs=0;
        String testString= s.toLowerCase();
        for(int i=0; i<testString.length(); i++)
        {
            if(testString.charAt(i)=='a' || testString.charAt(i)=='e'|| testString.charAt(i)=='i'||testString.charAt(i)=='o' ||testString.charAt(i)=='u')
            {
                cv+=1;
            }
            else if(testString.charAt(i)==1 || testString.charAt(i)==2 || testString.charAt(i)==3 || testString.charAt(i)==4 || testString.charAt(i)==5 || testString.charAt(i)==6 || testString.charAt(i)==7 || testString.charAt(i)==8|| testString.charAt(i)==9 || testString.charAt(i)==0)
            {
                cd+=1;
            }
            else if(testString.charAt(i)==' ')
            {
                cs+=1;
            }
            else {
                cc+=1;
            }
        }
        System.out.println("Vowels="+cv);
        System.out.println("Consonants="+cc);
        System.out.println("Digits="+cd);
        System.out.println("Spaces="+cs);

    }
}