package week4.day1;

public class AbstractionImplementation extends MySqlConnection {
	

	@Override
	public void connect() {
		System.out.println("Connected Absatraction");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected Abstraction");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed Connected Abstraction");
		
		
	}
	
	@Override
	public void executeQuery() {
		super.executeQuery();
		System.out.println("Super Keyword Implemented");
	}
public static void main(String[] args) {
	
	AbstractionImplementation implement = new AbstractionImplementation();
	implement.connect();
	implement.disconnect();
	implement.executeUpdate();
	implement.executeQuery();

	}
}
