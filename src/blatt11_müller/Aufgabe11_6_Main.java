package blatt11_müller;

public class Aufgabe11_6_Main {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		try {
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());
			a.addB(b);
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());
			a.addB(new B());

		} catch (NoMoreRemotesException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		
		a.removeB(b);
		System.out.println(a);
	}

}
