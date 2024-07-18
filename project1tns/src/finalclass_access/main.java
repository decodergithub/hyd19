package finalclass_access;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalclass obj = new finalclass();
		obj.setvalue(30);
		System.out.println(obj.getValue());
		obj.setvalue(40);
		System.out.println(obj.getValue());
		// no inheritance can be used in final class

	}

}
