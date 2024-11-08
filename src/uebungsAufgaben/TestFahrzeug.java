package uebungsAufgaben;


public class TestFahrzeug {
	public static void main(String[] args) {

		Fahrzeug f1 = new Fahrzeug();

		f1.setMarke("Prosche");
		f1.setModell("Panamera");
		f1.setFarbe("Silber");
		f1.setBaujahr(InputTools.readInteger("Bitte Baujahr eingeben: "));
		f1.setKilometerstand(5000);

		System.out.println(f1.toString());
	}

}
