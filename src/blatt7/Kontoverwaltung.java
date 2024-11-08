package blatt7;
import uebungsAufgaben.InputTools;

public class Kontoverwaltung {
	
	public static void main(String[] args) {
		
		Girokonto g = new Girokonto();
		Kreditkartenkonto k = new Kreditkartenkonto();
		Sparkonto s = new Sparkonto();
		
		int giroNr = InputTools.readInteger("Bitte Kontonummer des Girokontos eingeben: ");
		int giroSaldo = InputTools.readInteger("Bitte Saldo des Girokontos eingeben: ");
		
		int kreditNr = InputTools.readInteger("Bitte Kontonummer des Kreditkartenkontos eingeben: ");
		int kreditSaldo = InputTools.readInteger("Bitte Saldo des Kreditkartenkontos eingeben: ");
		
		int sparNr = InputTools.readInteger("Bitte Kontonummer des Sparkontos eingeben: ");
		int sparSaldo = InputTools.readInteger("Bitte Saldo des Sparkontos eingeben: ");
		
		g.setKontonr(giroNr);
		g.setSaldo(giroSaldo);
		k.setKontonr(kreditNr);
		k.setSaldo(kreditSaldo);
		s.setKontonr(sparNr);
		s.setSaldo(sparSaldo);
		
		int perKonto = InputTools.readInteger("Perkonto eingeben: ");
		int anKonto = InputTools.readInteger("Ankonto eingeben: ");
		
		int b = InputTools.readInteger("Betrag eingeben: ");
		
		Konto pk=null, ak=null;
		
		if(perKonto == g.getKontonr()) {
			pk = g;
		} else if(perKonto == k.getKontonr()) {
			pk = k;
		} else if(perKonto == s.getKontonr()) {
			pk = s;
		} else {
			System.out.println("Konto existiert nicht.");
			System.exit(0);
		}
		
		if(anKonto == g.getKontonr()) {
			ak = g;
		} else if(anKonto == k.getKontonr()) {
			ak = k;
		} else if(anKonto == s.getKontonr()) {
			ak = s;
		} else {
			System.out.println("Konto existiert nicht.");
			System.exit(0);
		}
		
		if(pk == s && s.getSaldo() < b) {
			System.out.println("Überweisung nicht möglich.");
			System.exit(0);
		} else {
			pk.auszahlen(b);
			ak.einzahlen(b);
		}
		System.out.println(g + "\n" + k + "\n" + s);
		
		
		
	}

}
