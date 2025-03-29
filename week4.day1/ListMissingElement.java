package week4.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 8, 6, 7};
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int value1 : a)
		{
			list1.add(value1);
		}
		Collections.sort(list1);

        // Loop through the sorted array to find missing numbers
        for (int i = 0; i < list1.size() - 1; i++) {
            // Check if the current element + 1 is not equal to the next element
           if (list1.get(i) + 1 != list1.get(i+1)) {
        	   list2.add((list1.get(i) + 1));
        	   System.out.println("Missing number: " +list2);
        	   
        	   
                }
            }
        }
    }