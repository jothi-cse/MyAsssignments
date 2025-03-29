package week4.day1;

public class Overriding extends Overloading {
	
	public void reportStep(String msg,String status)
	{
		System.out.println("Message:"+msg+ "\n "+ "Status:"+status );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding over1 = new Overriding();
		over1.reportStep("Overriding", "Successful");
	}

}
