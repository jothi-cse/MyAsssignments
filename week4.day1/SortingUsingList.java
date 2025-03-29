package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String[] a =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
	        List<String> list1 = new ArrayList<String>();
	        List<String> outputlist = new ArrayList<String>();
	        
	        for (String value1 : a)
			{
				list1.add(value1);
			}
			Collections.sort(list1);
			System.out.println("Ascending order:" +list1);
			
			for (int i = list1.size()-1; i >=0; i--) {
				
				outputlist.add(list1.get(i));
				
				
			}
			System.out.println("Reversed order:"+outputlist);
	}

}
