class pp3
{
	public static void main(String[] args) 
	{ 
		int n = 4;
		char ch = 'a';
		int num = 1;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if(i % 2 == 0){
				    System.out.print(num++ +" ");
			    }else{
			      System.out.print(ch++ + " ");
				}
		    }
			System.out.println();
		
	}
}
}