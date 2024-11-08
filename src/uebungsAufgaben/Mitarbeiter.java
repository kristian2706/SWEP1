package uebungsAufgaben;

public class Mitarbeiter {

	private String name, vorname;
	private int personalNr;

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getPersonalNr() {
		return personalNr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setPersonalNr(int persnr) {
		personalNr = persnr;
	}

	public String toString() {
		return "Name: " + name + "\nVorname: " + vorname + "\nPERSONALNUMMER: " + personalNr;
	}
	

}
