
class StrongNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18, 145, 2};

        countNum(arr);
        int[] strong = storeStrongNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(strong[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (strongNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeStrongNum(int[] nums) {
        int[] strong = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (strongNum(nums[i])) {
                strong[index] = nums[i];
                index++;
            }
        }

        return strong;
    }

    public static boolean strongNum(int num) {
        int n = num;
        int sum = 0;

        while (num != 0) {
            sum += factorial(num % 10);
            num /= 10;
        }

        return sum == n;
    }

    public static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
