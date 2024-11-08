package blatt5;

public class Adresse {

	private String str, hausNr, plz, ort;
	
	public Adresse(String str, String hausnr, String plz, String ort) {
		this.str = str;
		hausNr = hausnr;
		this.plz = plz;
		this.ort = ort;
	}
	public Adresse() {
		
	}

	public String getStr() {
		return str;
	}

	public String getHausNr() {
		return hausNr;
	}

	public String getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setStr(String strasse) {
		str = strasse;
	}

	public void setHausNr(String hNr) {
		hausNr = hNr;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public void setOrt(String o) {
		ort = o;
	}

	public String toString() {
		return str + " " + hausNr + "\n" + plz + " " + ort;
	}

}
