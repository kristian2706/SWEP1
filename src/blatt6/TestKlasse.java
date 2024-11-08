package blatt6;

import uebungsAufgaben.InputTools;

public class TestKlasse {

	public static void main(String[] args) {
		Kreditkartenkonto k = new Kreditkartenkonto();

		k.setKontonr(1234);
		k.setSaldo(InputTools.readInteger("Saldo eingeben: "));

		System.out.println(k);

		Girokonto g = new Girokonto(InputTools.readInteger("Kontonummer eingeben: "),
				InputTools.readInteger("Saldo eingeben: "));

		System.out.println(g);

		int b = InputTools.readInteger("Betrag eingeben: ");

		g.auszahlen(b);
		k.einzahlen(b);

		System.out.println(g);
		System.out.println(k);

		Sparkonto s = new Sparkonto();

		s.setKontonr(InputTools.readInteger("Kontonummer eingeben: "));
		s.setSaldo(InputTools.readInteger("Saldo eingeben: "));

		s.auszahlen(b);

	}

}
