package uebungsAufgaben;

import java.time.LocalDate;

public class Fahrzeug {


	public int fahrzeugAlter() {
		int aktuellesJahr = LocalDate.now().getYear();
		return aktuellesJahr-baujahr;
	}
	
	
	public String toString() {
		return "Ein " + marke + " " + modell +  " in der Farbe " + farbe + " aus dem Jahr " 
	+ baujahr + " mit einem Kilometerstand von " + kilometerstand + "km.\nDas Auto ist " + fahrzeugAlter() + " Jahre alt.";
	}

	private String marke, modell, farbe;
	private int baujahr, kilometerstand;
	private boolean konsistent = true;

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		int aktuellesJahr = LocalDate.now().getYear();
		if (baujahr <= aktuellesJahr) {
			System.out.println("Baujahr auf " + baujahr + " festgelegt.");
		} else {
			this.konsistent = false;
			System.out.println("Das Baujahr kann nicht in der Zukunft liegen.");
		}
		this.baujahr = baujahr;
	}

	public boolean getKonsistent() {
		return konsistent;
	}

	public void setKonsistent(boolean konsistent) {
		this.konsistent = konsistent;
	}

	public int getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(int kilometerstand) {
		if (kilometerstand >= 0) {
			this.kilometerstand = kilometerstand;
		} else {
			this.konsistent = false;
			System.out.println("Der Kilometerstand kann nicht negativ sein.");
		}
	}

	public Fahrzeug() {

	}

	public Fahrzeug(String marke, String modell, String farbe, int baujahr, int kilometerstand) {
		this.marke = marke;
		this.modell = modell;
		this.farbe = farbe;
		this.baujahr = baujahr;
		this.kilometerstand = kilometerstand;
	}

}
