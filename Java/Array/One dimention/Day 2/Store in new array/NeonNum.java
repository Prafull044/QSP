
class NeonNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 9, 59, 39, 29, 18};

        countNum(arr);
        int[] neon = storeNeonNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(neon[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (neonNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeNeonNum(int[] nums) {
        int[] neon = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (neonNum(nums[i])) {
                neon[index] = nums[i];
                index++;
            }
        }

        return neon;
    }

    public static boolean neonNum(int num) {
        int sum = 0;
        int n = num;
        int sqr = num * num;

        while (sqr != 0) {
            sum += sqr % 10;
            sqr /= 10;
        }

        return sum == n;
    }
}
