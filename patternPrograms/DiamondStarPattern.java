public class DiamondStarPattern {
    public static void printDiamond(int num) {
        // top pyramid
        for (int i = 1; i <= num; i++)
        {
            for (int j = num; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // bottom pyramid
        for (int i = num - 1; i >= 1; i--)
        {
            for (int j = num - 1; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
