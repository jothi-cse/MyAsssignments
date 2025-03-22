package week3.day2;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader mode");
	}
	public void  fullScreenMode()
	{
		System.out.println("Full screen mode");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s= new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		
	}

}
