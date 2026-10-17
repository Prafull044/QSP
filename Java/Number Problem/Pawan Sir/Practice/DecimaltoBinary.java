class DecimaltoBinary
{
	public static void main(String[] args) 
	{
		int num = 10;
		
		int place = 1;
		int binary = 0;
		
		while (num > 0)
		{
			int digit = num % 2;
			binary = binary + (digit * place);
			place *= 10;
			
			num /= 2;
		}
		System.out.println(binary);
	}
}
