// Segregate Vowels and Consonants (char array)
import java.util.Arrays;
class vowelsConco
{
	public static void main(String[] args) 
	{
		char[] arr = {'i', 'L', 'o', 'V', 'e', 'Y', 'O', 'u'};
		vowelsConSegra(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void vowelsConSegra(char [] num)
	{
		int i= 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(num[i] == 'A' || num[i] == 'E' || num[i] == 'I' || num[i] == 'O' || num[i] == 'U' ||
			   num[i] == 'a' || num[i] == 'e' || num[i] == 'i' || num[i] == 'o' || num[i] == 'u')
			{
				i++;
			}else if(!(num[j] == 'A' || num[j] == 'E' || num[j] == 'I' || num[j] == 'O' || num[j] == 'U' ||
			   num[j] == 'a' || num[j] == 'e' || num[j] == 'i' || num[j] == 'o' || num[j] == 'u'))
			{
				j--;
			}else{
				char temp = num[i];
				num[j] = num[i];
				num[j] = temp;
			}
		}
	}
	
}
