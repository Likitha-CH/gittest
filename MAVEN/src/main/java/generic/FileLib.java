package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib 
{
	static String propFile="./src/main/resource/properties/browser.properties";
	
	public static String getProp(String key) 
	{
	Properties prop=new Properties();
	try
	{
		prop.load(new FileInputStream(propFile));
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		return prop.getProperty(key);
}
}
