package multiple_inheritance;

public class demo implements first_interface, second_interface {
	@Override
	public void mymethod() {
		System.out.println("first  class extraction at a time");
	}

	@Override
	public void myothermethod() {
		// TODO Auto-generated method stub
		System.out.println("second  class extraction at a time ");
	}

}
