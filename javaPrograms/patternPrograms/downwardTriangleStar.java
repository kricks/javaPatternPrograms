package patternPrograms;
// * * * * *
// * * * *
// * * *
// * *
// *

public class downwardTriangleStar {
    public static void printStarPattern(int rows) {
        int i, j;
        for (i=0; i<rows; i++) {
            for(j=i; j<rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}