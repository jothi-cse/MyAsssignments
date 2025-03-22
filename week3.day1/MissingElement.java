package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 8, 6, 7};
        Arrays.sort(a);

        int n = a.length + 1; // The total number of elements including the missing number

        // Loop through the expected range of numbers
        for (int j = 1; j < n; j++) {
            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + j);
                break;
            }
        }
    }

}

