package logicPrograms;

public class FindAllPrimeNumbers {
    // complexity is O(n)
    // this can be very slow if num is a large number like 100,000

    public static void printNumbers(int num) {
        // first for loop to print to 100. thats why i set it to < =
        for (int i = 0; i <= num; i++) {
            boolean isPrime = isPrimeNumber(i);
            if (isPrime) {
                System.out.println(i + ": prime number");
            } else {
                System.out.println(i + ": not a prime number");
            }
        }
    }

    private static Boolean isPrimeNumber(int n) {
        // return false because 0 and 1 are not prime numbers
        if (n <= 1) {
            return false;
        }
        // second loop starting at 2 because 2 is first prime number
        // and we are already checking for 0 and 1
        for (int i = 2; i < n; i++) {
            // check n with numbers leading up to n,
            // for exapmle n = 17,second for loop will check i 2 - 17
            // if n % any numbers of i == 0 then the number is not a prime
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
