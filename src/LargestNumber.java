import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N
        int n = sc.nextInt();
        
        // Read N strings
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        
        // Custom sort
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        
        // Edge case: all zeros
        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }
        
        // Concatenate result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        
        // Print result
        System.out.println(result.toString());
    }
}
