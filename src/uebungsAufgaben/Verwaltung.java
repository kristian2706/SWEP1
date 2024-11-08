package uebungsAufgaben;

public class Verwaltung {
	public static void main(String[] args) {

		Mitarbeiter m = new Mitarbeiter();

		m.setName(InputTools.readString("Name eingeben: "));
		m.setVorname(InputTools.readString("Vorname eingeben: "));
		m.setPersonalNr(InputTools.readInteger("Personalnummer eingeben: "));

		System.out.println(m);

	}

}
