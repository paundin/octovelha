
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializador {

	public Serializador() {}

	public static void serializar(String path, Object obj) throws Exception {
		FileOutputStream outFile = new FileOutputStream(path);
		ObjectOutputStream objectOutput = new ObjectOutputStream(outFile);
		objectOutput.writeObject(obj);
		objectOutput.close();		
		outFile.close();
	}
}