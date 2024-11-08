package blatt10_frenz;

public class Aufgabe_P10_3 {
	public static void main(String[] args) {
		System.out.println((int)Math.pow(8, 4) + 615);
		System.out.println(Integer.toString(4711, 8));
		
		System.out.println(System.currentTimeMillis());

		System.out.println(Double.toHexString(3.4));

		double grad = 45;
		double radiant = Math.toRadians(grad);
		System.out.println(Math.sin(radiant));
		
		StringBuilder sb = new StringBuilder("Hallo");
		sb.append(" Welt");
		System.out.println(sb.toString());

		double a = 3;
		double b = 4;
		System.out.println(Math.hypot(a, b));

		

	}

}
