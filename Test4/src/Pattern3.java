public class Pattern3
{
    public static void main(String[] args)
    {
	int rows = 5;
        System.out.println(" Printing the pattern ");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}