// Program to convert text to uppercase manually and compare.
import java.util.Scanner;
public class UppercaseConversion {
    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) ch -= 32;
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String manualUpper = convertToUpperCase(str);
        String builtInUpper = str.toUpperCase();
        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Both methods give the same result: " + compareStrings(manualUpper, builtInUpper));
        sc.close();
    }
}
