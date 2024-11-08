package blatt11_müller;

public class PunktMain {
	public static void main(String[] args) {

		Punkt a = new Punkt(1, 2);
		Punkt b = new Punkt(4, 6);

		System.out.println("Punkt A" + a);
		System.out.println("Punkt B" + b);

		System.out.println("Abstand A zu B: " + b.abstandZu(a));

	}

}
