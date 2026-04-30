package gitHub_practice;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws Throwable {
			FileInputStream fis= new FileInputStream("./commondata/commondata.properties");
			Properties pObj=new Properties();
			pObj.load(fis);
			String data=pObj.getProperty(key);
			System.out.println("TL update");
			System.out.println("TL update2");
			System.out.println("thursday update");

			return data;

}
}