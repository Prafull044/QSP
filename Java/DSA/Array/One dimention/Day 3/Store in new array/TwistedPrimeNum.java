
class TwistedPrimeNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] twisted = storeTwistedPrimeNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(twisted[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isTwistedNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeTwistedPrimeNum(int[] nums) {
        int[] twisted = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isTwistedNum(nums[i])) {
                twisted[index] = nums[i];
                index++;
            }
        }

        return twisted;
    }

    public static boolean isTwistedNum(int num) {
        if (primeNum(num)) {
            int rev = reverse(num);

            if (primeNum(rev)) {
                return true;
            }
        }

        return false;
    }

    public static boolean primeNum(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }
}
