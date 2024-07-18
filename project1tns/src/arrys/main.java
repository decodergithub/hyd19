package arrys;

public class main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// student[] object = new student[5];
		// object[0] = new student(1 ," vimal");
		// object[1] = new student(2 ," nirmal");
		// object[2] = new student(3 ," amal");
		// object[3] = new student(4 ," kamal");
		// object[4] = new student(5 ," bamal");
		// for( int i=0;i<=object.length;i++) {
		// System.out.println("Element at " + i + " : " +
		// object[i].userid +" "+ object[i].name);
		// }

		/*
		 * int[][][] threedimention = null; for(int i1=0;i1<3;i1++) { for(int
		 * j=0;j<3;j++) { for(int k=0;k<3;k++) { threedimention[i1][j][k] = i1 + j + k;
		 * } } } for(int i1=0;i1<=3;i1++) { for(int j=0;j<=3;j++) { for(int
		 * k=0;k<=3;k++) { System.out.println(threedimention[i1][j][k] + " "); }
		 * System.out.println(); } System.out.println(); }
		 */
		// Create a 3-dimensional array
		int[][][] threeDArray = new int[3][3][3];

		// Initialize the array with some values
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					threeDArray[i][j][k] = i + j + k;
				}
			}
		}

		// Print the values of the 3-dimensional array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println(); // Move to the next line after each row
			}
			System.out.println();
		}
	}
}
