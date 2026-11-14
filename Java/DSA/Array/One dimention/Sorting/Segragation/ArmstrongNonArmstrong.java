// Armstrong Num
import java.util.Arrays;

class ArmstrongNonArmstrong
{
    public static void main(String[] args)
    {
        int[] arr = {153, 12, 370, 25, 407, 123, 1, 1634};

        armstrong(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void armstrong(int[] num)
    {
        int i = 0;
        int j = num.length - 1;

        while (i < j)
        {
            if (isArmstrong(num[i]))
            {
                i++;
            }
            else if (!isArmstrong(num[j]))
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

    public static boolean isArmstrong(int num)
    {
        int n = num;
        int count = 0;
        int sum = 0;
        int temp = num;

        while (temp != 0)
        {
            count++;
            temp /= 10;
        }

        temp = num;

        while (temp != 0)
        {
            int rem = temp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++)
            {
                power *= rem;
            }

            sum += power;
            temp /= 10;
        }

        return sum == n;
    }
}
