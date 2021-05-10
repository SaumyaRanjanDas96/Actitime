package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public static void main(String[] args) throws IOException {
	FileInputStream	fis=new FileInputStream("./file/property1.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty("password");
	System.out.println(value);
	
	
	}

}
