// 35.WAP to print last digit from char[]


class LastDigit
{
    public static void main(String[] args)
    {
      char[] ch = {'A', '4', '#', '8', 'm', '2'};

        System.out.println(lastCon(ch));
    }

    public static char lastCon(char[] ch)
    {
        for (int i = ch.length - 1; i >= 0; i--)
        {
                if (ch[i] >= '0' && ch[i] <= '9')
                {
                    return ch[i];
                }
            
        }
        return '\0';
    }
}