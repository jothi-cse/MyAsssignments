package week3.day2;

public class Edge extends Browser{
	
	public void takeSnap() {
		System.out.println("Snap taken");
	}
	public void clearCookies()
	{
		System.out.println("Cookies cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
	}

}
