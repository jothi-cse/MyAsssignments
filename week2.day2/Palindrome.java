package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 11211;
		int temp = input;
		int output = 0;
		while (temp > 0) {
			int remainder = temp%10;
			output = output*10+remainder;
			temp = temp/10;
			
		}
		if (input==output) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
