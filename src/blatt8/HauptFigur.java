package blatt8;

public class HauptFigur {
	public static void main(String[] args) {

		Rechteck r = new Rechteck();
		Kreis k = new Kreis();

		r.setBreite(4f);
		r.setHoehe(3f);
		r.setX(5f);
		r.setY(2f);

		k.setRadius(5f);
		k.setX(10f);
		k.setY(4f);

		System.out.println(r);
		System.out.println("\n" + k);

	}

}
