package blatt11_müller;

public class Aufgabe11_3 {
	public static void main(String[] args) {
		
		String a = "Hier ist ein Beispieltext, der mehrere 'er' enthält, unabhängig von der Groß- und Kleinschreibung.";
		a = a.toLowerCase();
		
		int count1 = 0;
		int index1 = 0;
		
		while((index1 = a.indexOf("er",index1)) > -1 ) {
			count1++;
			index1++;
		}
		System.out.println("Die Zeichenfolge 'er' kommt " + count1 + " mal vor.");
		
		int count2 = 0;
		int index2 = 0;
		
		StringBuilder text = new StringBuilder("Hier ist ein weiterer Beispieltext, der mehrere 'er' enthält, unabhängig von der Groß- und Kleinschreibung. ");
		text.
		while((index2 = text.indexOf("er",index2)) > -1 ) {
			count2++;
			index2++;
		}
		System.out.println("Die Zeichenfolge 'er' kommt " + count2 + " mal vor.");
		
	}

}
