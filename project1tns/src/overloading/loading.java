package overloading;

public class loading {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//accessing private method
	private void method() {
		System.out.println("this is private");
	}

	public void access() {
		method();
	}

}
