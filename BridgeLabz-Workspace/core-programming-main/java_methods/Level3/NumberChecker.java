// Utility class for number analysis.
public class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) digits[i] = numStr.charAt(i) - 
0;
        return digits;
    }
    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0");
    }
    public static boolean isArmstrong(int number) {
        int[] digits = storeDigits(number);
        int sum = 0, power = digits.length;
        for (int digit : digits) sum += Math.pow(digit, power);
        return sum == number;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) { secondLargest = largest; largest = digit; }
            else if (digit > secondLargest) secondLargest = digit;
        }
        return new int[]{largest, secondLargest};
    }
    public static void main(String[] args) {
        int number = 153; // Example
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));
        int[] largestValues = findLargestAndSecondLargest(storeDigits(number));
        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);
    }
}
