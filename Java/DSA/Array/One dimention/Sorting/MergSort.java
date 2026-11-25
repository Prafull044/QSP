
import java.util.*;

class MergSort
{
    public static void main(String[] args)
    {
        int[] arr = {12, 34, 40, 50, 327, 23, 43, 32};

        devide(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void devide(int[] nums)
    {
        if(nums.length <= 1)
        {
            return;
        }

        int[] left = new int[nums.length / 2];
        int[] right = new int[nums.length - left.length];

        for(int i = 0; i < left.length; i++)
        {
            left[i] = nums[i];
        }

        for(int j = 0; j < right.length; j++)
        {
            right[j] = nums[j + left.length];
        }

        devide(left);
        devide(right);

        merge(left, right, nums);
    }

    public static void merge(int[] left, int[] right, int[] nums)
    {
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                nums[k] = left[i];
                i++;
            }
            else
            {
                nums[k] = right[j];
                j++;
            }

            k++;
        }

        while(i < left.length)
        {
            nums[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length)
        {
            nums[k] = right[j];
            j++;
            k++;
        }
    }
}
