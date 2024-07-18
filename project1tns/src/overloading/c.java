package overloading;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loading person = new loading();
		person.setName("John");
		person.setAge(30);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		person.access();

	}

}
