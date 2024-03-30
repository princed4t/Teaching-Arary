import java.io.Serializable;

public class Interview2fullysingelton implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Interview2fullysingelton interview2fullysingelton = null;

	private Interview2fullysingelton() throws IllegalAccessException {
		if (interview2fullysingelton != null) {
			throw new IllegalAccessException();
		}

	}

	public static Interview2fullysingelton getSingeltonInterview2fullysingelton() throws IllegalAccessException {
		if (interview2fullysingelton == null) {
			return interview2fullysingelton = new Interview2fullysingelton();
		} else
			return interview2fullysingelton;

	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("i love you");

	}

	protected Object readResolve() {
		return interview2fullysingelton;
	}

}
