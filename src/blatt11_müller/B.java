package blatt11_müller;

public class B {

	private int randomInt;

	public B() {
		randomInt = (int) (Math.random() * 100);
	}

	public int getRandomInt() {
		return randomInt;
	}

	public String toString() {
		return "B(" + randomInt + ")";
	}

}
