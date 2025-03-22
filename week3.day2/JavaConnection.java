package week3.day2;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute Updated");
	}
      public static void main (String[] args)
      {
    	  JavaConnection cnt = new JavaConnection();
    	  cnt.connect();
    	  cnt.disconnect();
    	  cnt.executeUpdate();
    	  
}
}
