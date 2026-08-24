import java.util.Scanner;

class Palindrome 
{
    static String value;

    public static void main(String[] args) 
    {   
        System.out.print("Enter a value : ");
        value = new Scanner(System.in).next();
        isPalindrome();
    }
    
    public static void isPalindrome()
    {   
        String rev = "";
        for (int i = value.length() - 1; i >= 0; i--)
        {
            rev = rev + value.charAt(i);
        }
        
        if (rev.equals(value))
        {
            System.out.println("The value is a Palindrome");
        }
        else
        {
            System.out.println("The value is NOT a Palindrome");
        }
    }
}