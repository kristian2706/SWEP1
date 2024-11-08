package uebungsAufgaben;

public class Quersumme {
	public static void main(String[] args) {
		System.out.println("Guten Tag!\nDieses Programm berechnet eine Quersumme.");
		int a = InputTools.readInteger("Bitte geben sie eine Zahl 0..9999 ein: ");

		int b = a % 10;
		a = a / 10;
		int d = a % 10;
		a = a / 10;
		int e = a % 10;
		a = a / 10;
		int g = a % 10;
		int erg = b + d + e + g;

		System.out.println("Die Quersumme ist: " + b + "+" + d + "+" + e + "+" + g + " = " + erg);

	}

}
