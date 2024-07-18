package autoboxing;

public class exception_handling {

	public static void main(String[] args) {
		try {
			int vev[] = new int[5];
			vev[10] = 50 / 0;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("rest of the code");
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("bhhdhd");
		} finally {
			System.out.println("code get executed");
		}

	}

}
