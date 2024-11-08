package blatt11_müller;

public class Punkt {
	
	private double x;
	private double y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public double abstandZu(Punkt b) {
		return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow(b.y - this.y, 2));
	}
	
	public String toString() {
		return "(" + x + "|" + y + ")";
	}

}
