package logicPrograms;

public class GcdOfTwoNumbers {
    // find GCD of two numbers using the euclidean greatest common divisor
    public static Integer gcd(int a, int b) {
        // if a or b is 0, return the other one
        if (b == 0) return a;
        // repeat with the new a as b and the new b as a%b
        return gcd(b, a%b);
    }
}
