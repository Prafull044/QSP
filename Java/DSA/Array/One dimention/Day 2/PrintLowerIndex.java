// 14.WAP to print lowercase character index from char[]
class PrintLowerIndex
{
    public static void main(String[] args)
    {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};

        printLowerIndexx(ch);
    }

    public static void  printLowerIndexx(char[] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            if ( c[i] >= 'a' && c[i] <= 'z' )
            {
                System.out.print(i + " ");
            }
        }
    }
}
