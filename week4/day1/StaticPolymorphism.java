package week4.day1;

public class StaticPolymorphism {
	
	public void reportStep (String msg, String status) {
		
		System.out.println(msg);
		System.out.println(status);
	}
		
		public void reportStep (String msg, String status, boolean takesnap) {
			
			System.out.println(msg);
			System.out.println(status);
			System.out.println(takesnap);
		
	}

	public static void main(String[] args) {
		StaticPolymorphism homeTest= new StaticPolymorphism();
		homeTest.reportStep("Karthik", "Successfully completed Assignment");
	
		homeTest.reportStep("Monica", "Is Brilliant", true);
		
		

	}

}
