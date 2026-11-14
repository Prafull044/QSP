
class Reverse {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 9, 59, 39, 29, 18};

        countNum(arr);
        int[] rev = storeRevNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(rev[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (revNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeRevNum(int[] nums) {
        int[] rev = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (revNum(nums[i])) {
                rev[index] = nums[i];
                index++;
            }
        }

        return rev;
    }

    public static boolean revNum(int num) {
        int revsers = 0; 
		int n = num;

        while (num != 0) {
            revsers = revsers * 10 + (num % 10);
            num /= 10;
        }

        return revsers == n;
    }
}
