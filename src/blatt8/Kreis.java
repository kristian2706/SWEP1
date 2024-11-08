package blatt8;

public class Kreis extends Figur {
	private float radius;

	public Kreis() {
		super(0.0f, 0.0f);
		setRadius(0.0f);
	}

	public Kreis(float x, float y, float r) {
		super(x, y);
		setRadius(r);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public String toString() {
		return "KREIS\n" + super.toString() + "\nRadius: " + radius + " cm";
	}

}
