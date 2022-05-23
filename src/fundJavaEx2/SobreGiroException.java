package fundJavaEx2;

public class SobreGiroException extends Exception {

	private double deficit;

	public SobreGiroException(String message) {
		super(message);
	}

	public double getDeficit() {
		return deficit;
	}

	public void setDeficit(double deficit) {
		this.deficit = deficit;
	}

}
