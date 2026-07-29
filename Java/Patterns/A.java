class A
{
	public static void main(String[] args) 
	{
int num = 13;
   // A
for (int i = 0; i < num; i++)
{
    for (int j = 0; j < num; j++)
    {
        if (i + j == num/2 ||
            j - i == num/2 ||
            (i == num/2) || j==0 && i> num/2 || j == num-1 && i> num/2)
        {
            System.out.print("* ");
        }
        else
        {
            System.out.print("  ");
        }
    }
    System.out.println();
}
}
	}

