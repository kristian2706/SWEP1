package blatt7;

import uebungsAufgaben.InputTools;

public class TestPerson {
	public static void main(String[] args) {

		Person p = new Person("Max", "Mustermann", 27, 6, 2001);

		int tag = InputTools.readInteger("Tag: ");
		int monat = InputTools.readInteger("Monat: ");
		int jahr = InputTools.readInteger("Jahr: ");

		System.out.println(p.toString() + p.alter(tag, monat, jahr) + " Jahre alt.");

	}

}
