
class SunnyNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 55, 33, 31, 59, 39, 8, 18};

        countNum(arr);
        int[] sunny = storeSunnyNum(arr);

        for (int i = 0; i < count; i++) {
            System.out.println(sunny[i]);
        }

        System.out.println("Count: " + count);
    }

    public static void countNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (sunnyNum(num[i])) {
                count++;
            }
        }
    }

    public static int[] storeSunnyNum(int[] nums) {
        int[] sunny = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sunnyNum(nums[i])) {
                sunny[index] = nums[i];
                index++;
            }
        }

        return sunny;
    }

    public static boolean sunnyNum(int num) {
        int n = num + 1;

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
