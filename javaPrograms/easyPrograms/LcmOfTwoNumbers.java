package easyPrograms;

public class LcmOfTwoNumbers {
    // lcm(a,b) = (a*b) / GCF(a,b)
    // lcm (6, 10) = 2 --> (6*10)/2 = 30
    public static Integer lcm(int a, int b) {
        int gcf = findGcf(a, b);
        return (a*b)/gcf;
    }

    private static Integer findGcf(int a, int b) {
        if (b == 0) return a;
        return findGcf(b, a%b);
    }
}
