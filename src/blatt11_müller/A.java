package blatt11_müller;

public class A {

	private B[] remotes = new B[10];

	public void addB(B newB) throws NoMoreRemotesException {
		for (int i = 0; i < remotes.length; i++) {
			if (remotes[i] == null) {
				remotes[i] = newB;
				return;
			}
		}
		throw new NoMoreRemotesException(newB);
	}

	public boolean removeB(B oldB) {
		for (int i = 0; i < remotes.length; i++) {
			if (remotes[i] == oldB) {
				remotes[i] = null;
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String str = "";
		for (B x : remotes) {
			str += x;
		}
		return str;
	}

}
