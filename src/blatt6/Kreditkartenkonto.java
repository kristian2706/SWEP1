package blatt6;

public class Kreditkartenkonto extends Konto {

	public Kreditkartenkonto() {

	}

	public Kreditkartenkonto(int kontonr, int saldo) {
		super(kontonr, saldo);
	}

	public String toString() {
		return "KREDITKARTENKONTO" + super.toString();
	}

}
