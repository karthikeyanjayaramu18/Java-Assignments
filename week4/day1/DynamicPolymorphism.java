package week4.day1;

public class DynamicPolymorphism extends RuntimePolymorphism{
	
	public void polymorphismCheck() {
		
		super.polymorphismCheck();
		
		System.out.println("Karthik Successfully learned Polymorphism");

	}

	public static void main(String[] args) {
		
	DynamicPolymorphism polymorphism = new DynamicPolymorphism();
	
	polymorphism.polymorphismCheck();

	}

}
