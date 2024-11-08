package blatt9;

public class Konto implements IWert {
	private int saldo;
	
	public Konto() {
		
	}
	public Konto(int saldo) {
		this.saldo = saldo;
	}
	public int gibWert() {
		return saldo;
	}
	public String toString() {
		return "Konto mit Saldo: " + saldo + "€";
	}
	
	

}
