
//         *
//       * *
//     * * *
//   * * * *
// * * * * *

public class Main
{
    public static void main(String[] args) {
        printStarPattern(5);
    }

    public static void printStarPattern(int rows) {
        int i, j, k=2*rows-2;
        for (i=0; i<rows; i++) {
            for(j=0; j<k; j++) {
                System.out.print(" ");
            }
            k = k-2;
            for (j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

