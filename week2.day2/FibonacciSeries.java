package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8, a = 0, b = 1;
		System.out.println(a + "\n" + b);
		for (int i = 2; i < range; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
