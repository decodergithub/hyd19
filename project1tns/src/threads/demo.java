package threads;

public class demo {

	public static void main(String[] args) {
		multi_threading obj = new multi_threading();
		obj.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println(" main thread" + "  " + Thread.currentThread().getId() + "is running");

		}

	}

}
