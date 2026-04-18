package lab3b2;
import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        int count = countOccurrences(mainStr, subStr);

        System.out.println("Number of occurrences: " + count);

        sc.close();
    }

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move forward
        }

        return count;
    }
}