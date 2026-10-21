class ArmstongNum {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {12, 34, 153, 33, 31, 59, 39, 29, 18};

        index(arr);
        System.out.println("Count: " + count);
    }

    public static void index(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (armNum(num[i])) {
                count++;
                System.out.println(num[i]);
            }
        }
    }

    public static boolean armNum(int num) {
        int n = num;
        int sum = 0;
        int count = countt(num);
        while (num != 0) {
           
		   sum += power(num%10 , count);
		    num /= 10;
        }

        return sum == n;
    }
	
	
	public static int countt(int num)
	{
		int ct = 0;
		while (num != 0)
		{
			ct++;
            num /= 10;
		}
		return ct;
	}
	
	public static int power(int num, int count)
	{
		int pow = 1;
		for (int i =1;i <= count;i++ )
		{
			pow *= num;
		}
		return pow;
	} 
}