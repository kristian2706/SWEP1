package uebungsAufgaben;

public class TestKlasse {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hallo");
		StringBuilder sb2 = sb1;

		sb1.append(" Heini");
		System.out.println("sb1==sb2? " + (sb1 == sb2));

		String s1 = "Hallo";
		String s2 = s1;
		System.out.println("s1==s2? " + (s1 == s2));

		s1 = s1 + " Heini";
		System.out.println("s1==s2? " + (s1 == s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("***");

		System.out.println(sb2.charAt(4));
		System.out.println(sb2);
		System.out.println(sb2.indexOf("ei"));
	}

}
