package finalkeyword;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access example = new access();

		// Accessing final variable
		System.out.println("Final Variable Value: " + example.FINAL_VALUE);

		// Accessing normal variable
		System.out.println("Normal Variable Value: " + example.normalValue);

		// Trying to modify the final variable will result in a compilation error
		// example.FINAL_VALUE = 200;

		// Modifying the normal variable
		example.normalValue = 75;
		System.out.println("Modified Normal Variable Value: " + example.normalValue);
		// accessing and modeling final method
		// Accessing the final method
		example.finalMethod();

		// Accessing the normal method
		example.normalMethod();
		// Modifying and accessing the normal method
		example.normalMethod();
		example.modifiedMethod();

	}

}
