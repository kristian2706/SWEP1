package blatt7;

public class Person {

	public static final int[] TAGE_PRO_MONAT = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] MONATE = { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August",
			"September", "Oktober", "November", "Dezember" };
	private String name, vorname;
	private int gebTag, gebMonat, gebJahr;

	public Person() {
	}

	public Person(String n, String v, int gebT, int gebM, int gebJ) {
		name = n;
		vorname = v;
		setGeburtsMonat(gebM);
		setGeburtsTag(gebT);
		gebJahr = gebJ;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public int getGebTag() {
		return gebTag;
	}

	public int getGebMonat() {
		return gebMonat;
	}

	public int getGebJahr() {
		return gebJahr;
	}

	public void setName(String n) {
		name = n;
	}

	public void setVorname(String v) {
		vorname = v;
	}

	public void setGeburtsTag(int tag) {
		if (gebMonat > 0 && tag >= 1 && tag <= TAGE_PRO_MONAT[gebMonat]) {
			gebTag = tag;
		} else {
			System.out.println("Ungültiger Tag.");
		}
	}

	public void setGeburtsMonat(int monat) {
		if (monat >= 1 && monat <= 12) {
			gebMonat = monat;
		} else {
			System.out.println("Ungültiger Monat. Monate von 1 - 12.");
		}
	}

	public void setGebJahr(int gj) {
		gebJahr = gj;
	}

	public String toString() {
		String monatsname = gebMonat >= 1 && gebMonat <= 12 ? MONATE[gebMonat - 1] : "Ungültiger Monat";
		return vorname + " " + name + " hat am " + gebTag + ". " + monatsname + " " + gebJahr + " Geburtstag und ist ";
	}

	public int alter(int tag, int monat, int jahr) {
		if ((monat >= gebMonat) || tag >= gebTag && gebMonat == monat) {
			return jahr - gebJahr;
		} else {
			return jahr - gebJahr - 1;
		}
	}
}
