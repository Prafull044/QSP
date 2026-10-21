
class UglyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] ugly = storeUglyNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(ugly[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isUglyNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeUglyNum(int[] nums) {
        int[] ugly = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isUglyNum(nums[i])) {
                ugly[index] = nums[i];
                index++;
            }
        }

        return ugly;
    }

    public static boolean isUglyNum(int num) {
        if (num <= 0) {
            return false;
        }

        while (num % 2 == 0) {
            num /= 2;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }
}
