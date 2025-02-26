
import java.util.Scanner;

public class StringComparison {
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean result1 = compare(str1, str2);
        boolean result2 = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);
       
        sc.close();
    }
}
