// spy or non spy 
import java.util.Arrays;

class SpyNonSpy
{
    public static void main(String[] args)
    {
        int[] arr = {1124, 121, 22, 123, 112, 25, 4, 1124};

        spy(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void spy(int[] num)
    {
        int i = 0;
        int j = num.length - 1;

        while (i < j)
        {
            if (isSpy(num[i]))
            {
                i++;
            }
            else if (!isSpy(num[j]))
            {
                j--;
            }
            else
            {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;

                i++;
                j--;
            }
        }
    }

    public static boolean isSpy(int num)
    {
        int sum = 0;
        int product = 1;

        while (num != 0)
        {
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }

        return sum == product;
    }
}
