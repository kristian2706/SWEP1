package blatt6;

import uebungsAufgaben.InputTools;

public class TemperaturMitCase {
	public static void main(String[] args) {
		
		boolean validNum = true;
		System.out.println("Dieses Programm rechnet Temperaturen um");

		do {

			int richtung = InputTools.readInteger("Umrechnungsrichtung (0==°C->°F, 1==°F->°C) : ");
			switch (richtung) {

			case 0:
				double c = InputTools.readDouble("°Celsius: ");
				double f = ((9.0 / 5.0) * c) + 32;
				System.out.println(c + "°Celsius entsprechen " + f + "°Fahrenheit");
				validNum = true;
				break;
			case 1:
				f = InputTools.readDouble("°Fahrenheit: ");
				c = (5.0 / 9.0) * (f - 32);
				System.out.println(f + "°Fahrenheit entsprechen " + c + "°Celsius");
				validNum = true;
				break;
			default:
				System.out.println("Ungültige Option");
				validNum = false;
				break;
			}

		} while (!validNum);
	}

}
