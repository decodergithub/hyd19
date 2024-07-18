package finalkeyword;

public class access {
	// Final variable
	final int FINAL_VALUE = 100;

	// Normal variable
	int normalValue = 50;

	// accessing final method
	public final void finalMethod() {
		System.out.println("This is a final method.");
	}

	// Normal method
	public void normalMethod() {
		System.out.println("This is a normal method.");
	}

	// Modified method
	public void modifiedMethod() {
		System.out.println("This method has been modified.");
	}

}
