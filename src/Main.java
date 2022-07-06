public class Main {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 1; i <= 8; i++)
        {
            if (i <= 2 || (4 < i && i <= 6))
            {
                System.out.println("*********");
            }
            else
            {
                System.out.println("***   ***");
            }
        }
    }
}