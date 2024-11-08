package blatt10_müller;
import blatt5_müller.InputTools;

public class PruefungHauptprogramm {
	public static void main(String[] args) {
		
		int n = InputTools.readInteger("Anzahl Prüfuungen: ");
		Pruefung[] pruefungen = new Pruefung[n];
//		Pruefung temp;
		
		for(int i = 0; i < n; i++) {
			Pruefung pruefung = new Pruefung();
			pruefung.setLehrveranstaltung(InputTools.readString("Lehrveranstaltung: "));
			pruefung.setCreditpoints(InputTools.readInteger("Creditpoints: "));
			pruefung.setNote(InputTools.readInteger("Note: "));
			pruefungen[i] = pruefung;
		}

		
//		for(int i = 0; i < pruefungen.length; i++) {
//			for(int j = 0; j < pruefungen.length - 1 - i; j++) {
//				if(pruefungen[j].getNote() > pruefungen[j+1].getNote()) {
//					temp = pruefungen[j];
//					pruefungen[j] = pruefungen[j+1];
//					pruefungen[j+1] = temp;
//				}
//			}
//		}
		
		Pruefung.sortierePruefungen(pruefungen);
		
		for(Pruefung a : pruefungen) {
			System.out.println(a);
		}
		System.out.println(Pruefung.getAnzahl());
		
		
	}

}
