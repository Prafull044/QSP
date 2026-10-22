// 37.WAP to print last lowercase from char[]
class LastLower
{
    public static void main(String[] args)
    {
      char[] ch = {'A', 'b', 'M', 'n', 'P', 'z'};

        System.out.println(lastLower(ch));
    }

    public static char lastLower(char[] ch)
    {
        for (int i = ch.length - 1; i >= 0; i--)
        {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                {
                    return ch[i];
                }
            
        }
        return '\0';
    }
}