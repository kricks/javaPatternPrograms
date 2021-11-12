//  *  *  *  *  *
//  *           *
//  *           *
//  *           *
//  *  *  *  *  *

public class Main
{
    public static void main(String[] args) {
        printStarPattern(5);
    }

    public static void printStarPattern(int rows) {
        int i, j;
        for (i=0; i<rows; i++) {
            for(j=0; j<rows; j++) {
                if (i == 0 || i == rows-1 || j == 0 || j == rows-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
