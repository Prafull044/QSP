
//Segregate 0's and 1's
import java.util.Arrays;
class zeroOneSegragation 
{
	public static void main(String[] args) 
	{
		int [] arr = {1,0,0,1,1,1,2,0,0, 1};
		zeroNonSeg(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void zeroNonSeg(int [] num)
	{
	   int i = 0;
	   int j = num.length - 1;
	   while(i < j)
		{
			if(num[i] ==  0)
			{
				i++;
			}else if(num[j] == 1){
				j--;
			}else{
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
}
