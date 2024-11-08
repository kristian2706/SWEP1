package uebungsAufgaben;

public class Sparkonto extends Konto {
	public Sparkonto() {

	}

	public Sparkonto(int kontonr, int saldo) {
		super(kontonr, saldo);
	}

	public void auszahlen(int betrag) {
		if (getSaldo() - betrag >= 0) {
			setSaldo(getSaldo() - betrag);
		} else {
			System.out.println("Das Saldo darf nicht negativ werden.");
		}
	}

	public String toString() {
		return "SPARKONTO --- " + super.toString();
	}

}
