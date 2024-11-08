package uebungsAufgaben;

public class Konto {

	private int kontonr;
	private int saldo;

	public int getKontonr() {
		return kontonr;
	}

	public void setKontonr(int kontonr) {
		if (kontonr >= 10000 && kontonr <= 99999) {
			this.kontonr = kontonr;
		} else {
			System.out.println("Die Kontonummer muss 5-Stellig sein.");
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void einzahlen(int betrag) {
		saldo += betrag;
	}

	public void auszahlen(int betrag) {
		saldo -= betrag;
	}

	public Konto() {

	}

	public Konto(int kontonr, int saldo) {
		this.kontonr = kontonr;
		this.saldo = saldo;
	}

	public String toString() {
		return "KONTONUMMER: " + kontonr + "   SALDO: " + saldo + "$";
	}

}
