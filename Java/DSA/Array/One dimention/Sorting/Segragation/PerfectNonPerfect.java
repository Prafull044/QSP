// Segregate Perfect and Non-Perfect Numbers
import java.util.Arrays;

class PerfectNonPerfect
{
    public static void main(String[] args)
    {
        int[] arr = {6, 12, 28, 25, 496, 10, 8};

        perfectNum(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void perfectNum(int[] num)
    {
        int i = 0;
        int j = num.length - 1;

        while (i < j)
        {
            if (isPerfect(num[i]))
            {
                i++;
            }
            else if (!isPerfect(num[j]))
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

    public static boolean isPerfect(int num)
    {
        if (num <= 1)
            return false;

        int sum = 0;

        for (int i = 1; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                sum += i;
            }
        }

        return sum == num;
    }
}
