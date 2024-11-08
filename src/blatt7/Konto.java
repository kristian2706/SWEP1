package blatt7;

import uebungsAufgaben.InputTools;

public class Konto {
	private int kontonr;
	private int saldo;

	public int getKontonr() {
		return kontonr;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setKontonr(int nr) {
		if (nr < 10000 || nr > 99999) {
			System.out.println("Kontonummer muss 5-Stellig sein.");
		} else {
			kontonr = nr;
		}
	}

	public void setSaldo(int betrag) {
		saldo = betrag;
	}

	public void auszahlen(int betrag) {
		setSaldo(saldo - betrag);
	}

	public void einzahlen(int betrag) {
		saldo += betrag;
	}

	public String toString() {
		return "\nKontonummer: " + kontonr + "\nSaldo: " + saldo;
	}

	public Konto() {

	}

	public Konto(int kontonr, int saldo) {
		setKontonr(kontonr);
		setSaldo(saldo);
	}
	public void ueberweisen(int perKonto, int anKonto, int betrag) {
		betrag = InputTools.readInteger("Betrag eingeben: ");
		
	}
}
