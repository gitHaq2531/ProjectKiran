package Test_Code;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	
public String getDateFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fis= new FileInputStream("./TestData_Excel_Pro/comman_data_vtiger.properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		System.out.println("TL update");
		return data;
	}

}
