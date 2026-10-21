
class PerfectNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18, 6, 28};

        countNum(arr);
        int[] perfect = storePerfectNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(perfect[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isPerfectNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storePerfectNum(int[] nums) {
        int[] perfect = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isPerfectNum(nums[i])) {
                perfect[index] = nums[i];
                index++;
            }
        }

        return perfect;
    }

    public static boolean isPerfectNum(int num) {
        int n = num;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}
