package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3, 2, 11, 4, 6, 7};
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> outputlist = new ArrayList<Integer>();
		for (int value1 : a)
		{
			list1.add(value1);
		}
		Collections.sort(list1);
		System.out.println("Sorted list:"+list1);
		int sizelargest = list1.size()-2;
		outputlist.add(list1.get(sizelargest));
		System.out.println("Second Larget Number:"+outputlist);
	}

}
