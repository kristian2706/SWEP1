package blatt10_müller;

public class Pruefung {

	private String lehrveranstaltung;
	private int creditpoints;
	private float note;
	private static int anzahl = 0;
	
	public static int getAnzahl() {
		return anzahl;
	}

	public String getLehrveranstaltung() {
		return lehrveranstaltung;
	}

	public int getCreditpoints() {
		return creditpoints;
	}

	public float getNote() {
		return note;
	}

	public void setLehrveranstaltung(String lv) {
		lehrveranstaltung = lv;
	}

	public void setCreditpoints(int cp) {
		creditpoints = cp;
	}

	public void setNote(float n) {
		note = n;
	}

	public Pruefung() {
		anzahl++;
	}

	public Pruefung(String lv, int cp, float n) {
		lehrveranstaltung = lv;
		creditpoints = cp;
		note = n;
		anzahl++;
	}

	public String toString() {
		return "Lehrveranstaltung: " + lehrveranstaltung + "\nCreditpoints: " + creditpoints + "\nNote: " + note;
	}
	public static void sortierePruefungen(Pruefung[] pruefungen) {
		Pruefung temp;
		for(int i = 0; i < pruefungen.length; i++) {
			for(int j = 0; j < pruefungen.length - i - 1; j++) {
				if(pruefungen[j].getNote() > pruefungen[j+1].getNote()) {
					temp = pruefungen[j];
					pruefungen[j] = pruefungen[j+1];
					pruefungen[j+1] = temp;
				}
			}
		}
		
	}

}
