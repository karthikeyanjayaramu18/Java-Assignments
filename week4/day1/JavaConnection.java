package week4.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected Succesfully");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected Succesfully");
		
	}

	@Override
	public void executeUpdate() {
		String execute = "Executed and Updated Succesfully";
		System.out.println(execute);
		
	}
	
	public static void main(String[] args) {
		JavaConnection connection = new JavaConnection();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		
	}

}
