
import java.util.Scanner;

public class CharArrayConversion {
    public static char[] convertToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
        return arr;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] customArray = convertToCharArray(str);
        char[] builtInArray = str.toCharArray();
        System.out.println("Both methods give the same result: " + compareArrays(customArray, builtInArray));
        sc.close();
    }
}
