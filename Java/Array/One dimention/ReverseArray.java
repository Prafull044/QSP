// 18)WAP to iterate array element in reverse order

class ReverseArray
{
	public static void main(String[] args) 
	{
		int [] arr = {10, 20, 30, 40, 50};
		reverseArr(arr);
	}
	
	public static void reverseArr(int num[])
	{
		for (int i = (num.length - 1) ;i>= 0 ;i-- )
		{
			System.out.print(num[i]);
		}
	}
}
