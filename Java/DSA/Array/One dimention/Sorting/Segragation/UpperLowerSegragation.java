// 9) Segregate Uppercase and Lowercase
import java.util.Arrays;
class UpperLowerSegragation 
{
	public static void main(String[] args) 
	{
		char [] arr = {'a','e','i','r','t', 'O', 'E','N','M'};
		upperLower(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void upperLower(char [] cha)
	{
	   int i = 0;
	   int j = cha.length - 1;
	   while(i < j)
		{
			if(cha[i]  >= 'A' && cha[i] <= 'Z')
			{
				i++;
			}else if(cha[j] >= 'a' && cha[j] <= 'z'){
				j--;
			}else{
				char temp = cha[i];
				cha[i] = cha[j];
				cha[j] = temp;
			}
		}
	}
}

