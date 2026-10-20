// 2] WAP to print only vowels from char[]
 

class PrintVowels
{
    public static void main(String[] args)
    {
        char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};

        printVowels(ch);
    }

    public static void printVowels(char[] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            if (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' ||
                c[i] == 'O' || c[i] == 'U' || c[i] == 'a' ||
                c[i] == 'e' || c[i] == 'i' || c[i] == 'o' ||
                c[i] == 'u')
            {
                System.out.print(c[i] + " ");
            }
        }
    }
}



