//  *  *  *  *  *
//  *  *  *  *  *
//  *  *  *  *  *
//  *  *  *  *  *
//  *  *  *  *  *

public class SquareStarPattern
{
    public static void printStarPattern(int rows) {
        int i, j;
        for (i=0; i<rows; i++) {
            for(j=0; j<rows; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

