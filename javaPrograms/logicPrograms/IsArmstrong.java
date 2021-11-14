package logicPrograms;
// is armstrong number is when the sum of the nth power of each digit is equal to the number itself
// 371 = 3^3 + 7^3 + 1^3
public class IsArmstrong {
    public static Boolean isArmstrong(int num) {
        int temp = num, digits = 0, sum = 0, last;
        while (temp > 0) {
            temp = temp/10;
            digits++;
        }
        temp = num;
        while(temp > 0) {
            // gets last digit from number
            last = temp % 10;
            // calculates the power of anumber up to digit times and add the result to sum
            sum += (Math.pow(last, digits));
            // removes the last digit
            temp = temp/10;
        }
        return num == sum;
    }
}
