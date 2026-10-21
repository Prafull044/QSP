
class AutomorphicNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 25, 55, 33, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] auto = storeAutoNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(auto[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isAutoNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeAutoNum(int[] nums) {
        int[] auto = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isAutoNum(nums[i])) {
                auto[index] = nums[i];
                index++;
            }
        }

        return auto;
    }

    public static boolean isAutoNum(int num) {
        int sqr = num * num;
        int ct = count(num);

        return sqr % ct == num;
    }

    public static int count(int num) {
        int ct = 0;

        while (num != 0) {
            ct++;
            num /= 10;
        }

        int cot = 1;

        for (int i = 1; i <= ct; i++) {
            cot *= 10;
        }

        return cot;
    }
}
