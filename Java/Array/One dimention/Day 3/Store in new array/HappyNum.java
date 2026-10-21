
class HappyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 19, 33, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] happy = storeHappyNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(happy[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isHappyNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeHappyNum(int[] nums) {
        int[] happy = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isHappyNum(nums[i])) {
                happy[index] = nums[i];
                index++;
            }
        }

        return happy;
    }

    public static boolean isHappyNum(int num) {
        while (num != 1 && num != 4) {
            num = sumOfDigit(num);
        }

        return num == 1;
    }

    public static int sumOfDigit(int n) {
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }

        return sum;
    }
}
