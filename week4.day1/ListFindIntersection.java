package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,2,11,4,6,7}; 
		int b[]={1,2,8,4,9,7}; 
		List <Integer> list1 = new ArrayList<Integer>();
		List <Integer> list2 = new ArrayList<Integer>();
		List <Integer> outputlist = new ArrayList<Integer>();
		
		for (int value1 : a) {
            list1.add(value1);
        }
        for (int value2 : b) {
            list2.add(value2);
        }
		
		for ( int i=0 ; i<list1.size() ; i++)
		{
			for (int j=0; j<list2.size();j++)
			{
				 if (list1.get(i).equals(list2.get(j)))
				{
					outputlist.add(list1.get(i));
					
				}
			}
				
		}
		System.out.println(outputlist);
		
	}

}
