class BinaryToDecimal
{
	public static void main(String[] args) 
	{
		int num = 1010;
		
		int place = 1;
		int dec = 0;
		
		while (num > 0)
		{
			int digit = num % 10;
			dec = dec + (digit * place);
			place *= 2;
			
			num /= 10;
		}
		System.out.println(dec);
	}
}
