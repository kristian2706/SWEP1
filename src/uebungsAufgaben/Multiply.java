package uebungsAufgaben;

public class Multiply {
	public static void main(String[] args) {

		System.out.println("Guten Tag! Hier werden zwei Zahlen multipliziert.");
		
		int a = InputTools.readInteger("Bitte Zahl 1 eingeben: ");
		int b = InputTools.readInteger("Bitte Zahl 2 eingeben: ");
		
		System.out.println("Das Ergebnis von " + a + " * " + b + " ist " + a * b + ".");

	}

}
