package blatt5;

public class Klinik {
	private String name;
	private Adresse adr;
	private int anzBetten;
	private boolean hatNotaufnahme;

	public Klinik() {

	}

	public Klinik(String name, int anzBet, boolean hatNotaufnahme2, Adresse adr2) {
		this.name = name;
		adr = adr2;
		anzBetten = anzBet;
		hatNotaufnahme = hatNotaufnahme2;

	}

	public String getName() {
		return name;
	}

	public Adresse getAdresse() {
		return adr;
	}

	public int getAnzBetten() {
		return anzBetten;
	}

	public boolean getHatNotaufnahme() {
		return hatNotaufnahme;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAdr(Adresse a) {
		adr = a;
	}

	public void setAnzBetten(int anzahl) {
		anzBetten = anzahl;
	}

	public void setHatnotaufnahme(boolean dontKnow) {
		hatNotaufnahme = dontKnow;
	}

	public String toString() {
		String erg = "Das " + name + " hat " + anzBetten + " Betten";

		if (hatNotaufnahme) {
			erg += " und verfügt über eine Notaufnahme.";
		} else {
			erg += ".";
		}

		return erg + "\n" + adr;

	}

}
