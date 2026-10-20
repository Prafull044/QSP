
import java.util.Scanner;

class PrintChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        char[] ch = new char[size];

        for (int i = 0; i < size; i++)
        {
            ch[i] = sc.next().charAt(0);
        }

        printChar(ch);
  
    }

    public static void printChar(char[] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}
