package blatt8;

public class Figur {
	private float referenzpunkt_x;
	private float referenzpunkt_y;

	public Figur() {
		setX(0.0f);
		setY(0.0f);
	}

	public Figur(float x, float y) {
		referenzpunkt_x = x;
		referenzpunkt_y = y;
	}

	public float getX() {
		return referenzpunkt_x;
	}

	public float getY() {
		return referenzpunkt_y;
	}

	public void setX(float x) {
		referenzpunkt_x = x;
	}

	public void setY(float y) {
		referenzpunkt_y = y;
	}

	public String toString() {
		return "Refernzpunkt X: " + referenzpunkt_x + "\nReferenzpunkt Y: " + referenzpunkt_y;
	}

}
