package inheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlelevel1 b = new singlelevel1();
		b.method2();
		b.method1();
		muti3 m = new muti3();
		m.multi1();
		m.multi2();
		m.multi3();
		System.out.println("1.Multiple inheritance does not support in java...");
		System.out.println("2.but Multiple inheritance support  in interface..");
		hierarchicalchild1 a = new hierarchicalchild1();
		hierarchicalchild2 f = new hierarchicalchild2();
		hierarchicalchild3 c = new hierarchicalchild3();
		System.out.println("---------------------");
		a.hierchild1();
		a.hierpar();
		System.out.println("---------------------");
		f.hierchild2();
		f.hierpar();
		System.out.println("---------------------");
		c.hierchild3();
		c.hierpar();
		System.out.println("---------------------");
		hybridea q = new hybridea();
		hybrideb o = new hybrideb();
		hybrided l = new hybrided();
		System.out.println("--------");
		q.hybride1();
		q.hybride3();
		System.out.println("--------");
		o.hybride2();
		o.hybride3();
		System.out.println("--------");
		l.hybride4();
		l.hybride1();
		l.hybride3();
		System.out.println("--------");
	}
}
