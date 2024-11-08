package blatt9;

public class Gold implements IWert {
	private int menge;

	public Gold(int gewicht) {
		menge = gewicht;
	}

	public int gibWert() {
		return (int) (menge * (30 + (Math.random() * (75 - 30))));
	}

	public String toString() {
		return "Gold mit Menge: " + menge + " Gramm, Wert: " + gibWert() + "€";
	}

}
