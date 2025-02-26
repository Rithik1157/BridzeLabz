// Utility class to analyze digit frequencies.
import java.util.HashMap;
public class NumberFrequency {
    public static HashMap<Integer, Integer> findDigitFrequency(int number) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        while (number > 0) {
            int digit = number % 10;
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
        return frequencyMap;
    }
    public static void main(String[] args) {
        int number = 125512;
        System.out.println("Digit Frequencies: " + findDigitFrequency(number));
    }
}
