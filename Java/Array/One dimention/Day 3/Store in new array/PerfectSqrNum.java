
class PerfectSqrNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 9, 33, 31, 59, 39, 29, 18, 6, 28};

        countNum(arr);
        int[] perfect = storePerfectSqrNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(perfect[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isPerfectsqrNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storePerfectSqrNum(int[] nums) {
        int[] perfect = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isPerfectsqrNum(nums[i])) {
                perfect[index] = nums[i];
                index++;
            }
        }

        return perfect;
    }

    public static boolean isPerfectsqrNum(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num == i * i) {
                return true;
            }
        }

        return false;
    }
}
