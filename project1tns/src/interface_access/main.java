package interface_access;

public class main {

	public static void main(String[] args) {
		dog p = new dog();
		p.test();
		// banks pro
		Bank b = new sbi();
		System.out.println("roi" + b.rateofinterest());

	}
}
