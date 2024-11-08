package blatt10_müller;

public class Intervall {

	private double vonLinks, bisRechts;

	public Intervall() {

	}

	public Intervall(double l, double r) {
		vonLinks = l;
		bisRechts = r;
	}

	public void setVonLinks(double l) {
		vonLinks = l;
	}

	public void setBisRechts(double r) {
		bisRechts = r;
	}

	public double getVonLinks() {
		return vonLinks;
	}

	public double getBisRechts() {
		return bisRechts;
	}

	public boolean enthaelt(double x) {
		if (vonLinks < x && bisRechts > x) {
			return true;
		} else {
			return false;
		}
	}

	public boolean schneidet(Intervall b) {
		if ((this.vonLinks <= b.getVonLinks() && b.getVonLinks() <= this.bisRechts)
				|| (b.getVonLinks() <= this.vonLinks && this.vonLinks <= b.getBisRechts())) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Untere Grenze: " + vonLinks + "\nObere Grenze: " + bisRechts;
	}
}
