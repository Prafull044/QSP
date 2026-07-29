import java.util.Scanner;

class Prafull2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        // P
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (j == num/2 || i == 0 && j >= num/2 || j == num-1 && i < num/2 || i == num/2 && j >= num/2)
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

        System.out.println();
		System.out.println();

        // R
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (j == num/2 || i == 0 && j > num/2 || j == num-1 && i < num/2
                        || i == num/2 && j > num/2 || i > num/2 && i == j)
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

        System.out.println();
		System.out.println();

        // A
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == 0 && j >= num/2 || j == num/2 || i == num/2 && j >= num/2 || j == num-1)
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

        System.out.println();
		System.out.println();

        // F
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == 0 && j >= num/2 || j == num/2 || i == num/2 && j >= num/2)
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

        System.out.println();
		System.out.println();

        // U
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == num-1 && j >= num/2 || j == num/2 || j == num-1)
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

        System.out.println();
		System.out.println();

        // L
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == num-1 && j >= num/2 || j == num/2)
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

        System.out.println();
		System.out.println();

        // L
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if (i == num-1 && j >= num/2 || j == num/2)
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
