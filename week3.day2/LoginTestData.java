package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter the username");
	}
	public void enterPassword()
	{
		System.out.println("Enter the password");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LoginTestData log = new LoginTestData();
	log.enterUsername();
	log.enterPassword();
	log.enterCredentials();
	log.navigateToHomePage();

	}

}
