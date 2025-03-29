package week4.day1;

public class Overloading {

	//One version should accept two input arguments: a String for the message (msg) and another String for
	//the status (status)
	public void reportStep(String msg,String status)
	{
		System.out.println("Message:"+msg+ "\n "+ "Status:"+status );
	}
	//Another version of the reportStep method should accept three input arguments: a String for the message
	//(msg), a
	//String for the status (status), and a boolean parameter (snap) to indicate whether to take a snapshot.
	public void reportStep(String msg,String status,boolean snap)
	{
		System.out.println("Message:"+msg+ "\n "+ "Status:"+status+"\n " +"Snap:"+snap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading over = new Overloading();
		over.reportStep("Report", "Success");
		over.reportStep("Retry", "Fail", false);
	}

}
