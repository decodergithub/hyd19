package threads;

public class multi_threading implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("thread" + Thread.currentThread().getId() + "is running");

		}
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("thread asa;a" + Thread.currentThread().getId() + "is running");

	}

}
