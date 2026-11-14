
// 4) Segregate Zero and Non-Zero
import java.util.Arrays;
class zeroNonSegragation 
{
	public static void main(String[] args) 
	{
		int [] arr = {12,0,0,34,55,-33,22,4532,433,0, -3242};
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
			}else if(num[j] != 0){
				j--;
			}else{
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
}
