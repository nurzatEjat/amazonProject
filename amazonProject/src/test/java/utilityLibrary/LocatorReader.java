package utilityLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocatorReader {
	String filePath = "src/test/resources/locator.properties";
	Properties prop;
	
	
	
	public LocatorReader() {
		try {
		prop = new Properties();
	
		FileInputStream file = new FileInputStream(filePath);
		prop.load(file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getLocator(String locatorName) {

		
		
		return null;
	}
	
	
}
