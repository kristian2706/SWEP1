package blatt4;

public class Verwaltung {
	public static void main(String[] args) {

		Adresse a;
		a = new Adresse();

		a.setHausnr("6");
		a.setOrt("Memmingerberg");
		a.setPlz("87766");
		a.setStrasse("Am Westhang");

		Mitglied m;
		m = new Mitglied();

		m.setAdresse(a);
		m.setMitgliedsnr(283628);
		m.setName("Kunst");
		m.setVorname("Kristian");

		System.out.println(m + "\n" + a.toString());

		Adresse b = new Adresse();

		b.setHausnr("43");
		b.setOrt("ahfus");
		b.setPlz("787678");
		b.setStrasse("ahfizA");

		Mitglied m2 = new Mitglied();
		
	}
}
