package blatt6;

public class Sparkonto extends Konto {

//	public void auszahlen(int betrag) {
//		if (getSaldo() >= betrag) {
//			super.auszahlen(betrag);
//		} else {
//			System.out.println("Saldo darf nicht ins Minus gehen.\nBitte kleineren Betrag wählen.");
//		}
//	}

	public String toString() {
		return "SPARKONTO" + super.toString();
	}

	public Sparkonto() {

	}

	public Sparkonto(int kontonr, int saldo) {
		super(kontonr, saldo);
	}

	public void setSaldo(int betrag) {
		if (betrag < 0) {
			System.out.println("Saldo darf nicht negativ sein.");
		} else {
			super.setSaldo(betrag);
		}

	}

}
