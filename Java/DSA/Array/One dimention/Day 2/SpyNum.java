
class SpyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 6, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] spy = storeSpyNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(spy[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (spyNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeSpyNum(int[] nums) {
        int[] spy = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (spyNum(nums[i])) {
                spy[index] = nums[i];
                index++;
            }
        }

        return spy;
    }

    public static boolean spyNum(int num) {
        int sum = 0;
        int prod = 1;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }

        return sum == prod;
    }
}
