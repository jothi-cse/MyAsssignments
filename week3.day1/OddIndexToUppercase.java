package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] a = test.toCharArray();
		for (int i=0 ; i<a.length;i++)
		{
			if (i%2==1)
			{
				a[i]= Character.toUpperCase(a[i]);
				
			}
		}
		
		// Convert the modified char array back to a string
		String result = new String(a);
		System.out.println(result);
	}

}
