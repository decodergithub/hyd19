package constoverloading;

public class myclass {
	int num1;
	double num2;

	public myclass() {
		num1 = 1;
		num2 = 1.5;
		System.out.println(num1 + num2);
	}

	public myclass(int x) {
		num1 = x;
		System.out.println(num1 + num2);
	}

	public myclass(int x, double y) {
		num1 = x;
		num2 = y;
		System.out.println(num1 + num2);
	}

	void displaydata() {
		System.out.println(num1 + num2);
	}

}
