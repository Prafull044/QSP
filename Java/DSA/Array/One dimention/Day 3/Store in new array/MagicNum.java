
class MagicNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 19, 33, 31, 59, 39, 29, 18};

        countNum(arr);
        int[] magic = storeMagicNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(magic[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (isMagicNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeMagicNum(int[] nums) {
        int[] magic = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isMagicNum(nums[i])) {
                magic[index] = nums[i];
                index++;
            }
        }

        return magic;
    }

    public static boolean isMagicNum(int num) {
        while (num > 9) {
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num == 1;
    }
}
