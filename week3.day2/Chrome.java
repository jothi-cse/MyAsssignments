package week3.day2;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Incognito opened");
	}
	public void clearCache()
	{
		System.out.println("Cache cleared");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome c =new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
	}

}
