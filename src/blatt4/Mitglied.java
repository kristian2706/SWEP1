package blatt4;

public class Mitglied {

	private String name, vorname;
	private int mitgliedsnr;
	private Adresse adr;

	public Mitglied() {

	}

	public Mitglied(String name, String vorname, int mitgliedsnr, Adresse adr) {
		this.name = name;
		this.vorname = vorname;
		this.mitgliedsnr = mitgliedsnr;
		this.adr = adr;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitgliedsnr() {
		return mitgliedsnr;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setMitgliedsnr(int mitgliedsnr) {
		this.mitgliedsnr = mitgliedsnr;
	}

	public void setAdresse(Adresse adr) {
		this.adr = adr;
	}

	public String toString() {
		return "Name: " + name + "\nVorname: " + vorname + "\nMitgliedsnummer: " + mitgliedsnr;
	}

}