package practiceKM;

import java.io.FileInputStream;
import java.util.Properties;

public class fileUtility {
	
	public String getDataFromPropertiesFile(String Url, String Username, String Password) throws Throwable {
		
		FileInputStream fis =  new FileInputStream("./configAppData/commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(Password);
		System.out.println("TL update");
		return data;
		
	}

}
