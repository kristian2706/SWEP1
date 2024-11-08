package blatt10_müller;

import blatt5_müller.InputTools;

public class IntervallMain {
	public static void main(String[] args) {

		Intervall[] intervalle = new Intervall[3];

		for (int i = 0; i < intervalle.length; i++) {
			double l = InputTools.readDouble("Untere Grenze: ");
			double r = InputTools.readDouble("Obere Grenze: ");
			Intervall intervall = new Intervall(l, r);
			intervalle[i] = intervall;
		}
		double a = InputTools.readDouble("Punkt eingeben: ");
		
	    for (int i = 0; i < intervalle.length; i++) {
            for (int j = i + 1; j < intervalle.length; j++) {
                if (intervalle[i].schneidet(intervalle[j])) {
                    System.out.println("Die Intervalle " + intervalle[i] + " und " + intervalle[j] + " schneiden sich.");
                }
            }
        }
	    
	      for (int i = 0; i < intervalle.length; i++) {
	            if (intervalle[i].enthaelt(a)) {
	                System.out.println("Der Punkt " + a + " ist im Intervall " + intervalle[i] + " enthalten.");
	            }
	        }
		

	}

}
