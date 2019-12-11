
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializador<T> { 
 
    public Deserializador() {    }
     
    public T deserializar(String path) throws Exception {
    	FileInputStream inFile = new FileInputStream(path);
    	ObjectInputStream objectInStream = new ObjectInputStream(inFile);
    	T objeto = (T) objectInStream.readObject();
    	objectInStream.close();
    	inFile.close();
    	return objeto;
    }
        
}