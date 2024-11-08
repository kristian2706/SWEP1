package blatt9;

public class GoldWert {
	public static void main(String[] args) {
		
		IWert kontoWert;
		IWert goldWert;
		
		
		kontoWert = new Konto(5000);
		goldWert = new Gold(20);
		
		System.out.println("Der Wert des Kontos ist: " + kontoWert.gibWert() + "€");
		System.out.println("Der Wert des Goldes ist: " + goldWert.gibWert() + "€");
		

	}

}
