package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13, flag=0;
		if (number==0 || number==1 ||number <0 )
		{
			System.out.println(number + " " + "is not a Prime number");
		}
		else {
			int middlenumber = number/2;
		for (int i = 2; i <= middlenumber; i++) {
			if (number % i == 0) {
				System.out.println(number + " " + " is not a prime number");
				flag =1;
				break;
			} 
		}
		if (flag ==0) {
			System.out.println(number + " " + "is a Prime number");
		}
	}
	}
}
