
// 13.WAP to print uppercase character index from char[]


class PrintUpperIndex
{
    public static void main(String[] args)
    {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};

        printUpperIndex(ch);
    }

    public static void  printUpperIndex(char[] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            if ( c[i] >= 'A' && c[i] <= 'Z' )
            {
                System.out.print(i + " ");
            }
        }
    }
}