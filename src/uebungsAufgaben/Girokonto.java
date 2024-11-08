package uebungsAufgaben;

public class Girokonto extends Konto {
	public Girokonto() {
		
	}
	public Girokonto(int kontonr, int saldo) {
		super(kontonr, saldo);
	}
	public String toString() {
		return "GIROKONTO --- " + super.toString();
	}

}
