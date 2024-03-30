import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testingsingelton {

	public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException,
			InstantiationException, IllegalArgumentException, InvocationTargetException {
		Interview2fullysingelton singeltonInterview2fullysingelton = Interview2fullysingelton
				.getSingeltonInterview2fullysingelton();
		Interview2fullysingelton reflectionsingelton = null;

		// for seaarilization and deserilization

		FileOutputStream fos = new FileOutputStream("C:\\Users\\prince\\OneDrive\\Desktop\\seriliaze\\prince.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singeltonInterview2fullysingelton);

		FileInputStream fis = new FileInputStream("C:\\Users\\prince\\OneDrive\\Desktop\\seriliaze\\prince.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Interview2fullysingelton singelton = (Interview2fullysingelton) ois.readObject();
		System.out.println(singeltonInterview2fullysingelton.hashCode());
		System.out.println(singelton.hashCode());

		for (Constructor cons : Interview2fullysingelton.class.getDeclaredConstructors()) {
			cons.setAccessible(true);
			reflectionsingelton = (Interview2fullysingelton) cons.newInstance();

		}
      System.out.println(singeltonInterview2fullysingelton.hashCode());
      System.out.println(reflectionsingelton.hashCode());
		
		
		
		
	}

}
