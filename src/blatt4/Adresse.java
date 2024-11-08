package blatt4;

import uebungsAufgaben.InputTools;

public class Adresse {

	private String strasse, plz, ort, hausnr;

	public String getStrasse() {
		return strasse;
	}

	public String getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

	public String getHausnr() {
		return hausnr;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public void setHausnr(String hausnr) {
		this.hausnr = hausnr;
	}

	public Adresse() {

	}

	public Adresse(String strasse, String plz, String ort, String hausnr) {
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		this.hausnr = hausnr;
	}

	public String toString() {
		return "" + strasse + " " + hausnr + " " + plz + " " + ort;
	}

}
