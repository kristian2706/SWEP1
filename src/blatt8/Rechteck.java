package blatt8;


public class Rechteck extends Figur {
	private float hoehe;
	private float breite;

	public Rechteck() {
		setHoehe(0.0f);
		setBreite(0.0f);
	}

	public Rechteck(float x, float y, float h, float b) {
		super(x, y);
		setHoehe(h);
		setBreite(b);
	}

	public float getHoehe() {
		return hoehe;
	}

	public float getBreite() {
		return breite;
	}

	public void setHoehe(float h) {
		this.hoehe = h;
	}

	public void setBreite(float b) {
		this.breite = b;
	}
	public String toString() {
		return "RECHTECK\n" + super.toString() + "\nHöhe: " + hoehe + " cm" + "\nBreite: " + breite + " cm";
	}

}
