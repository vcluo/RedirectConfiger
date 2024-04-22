package com.example.demo.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
/**
 * 
 * @author cpplc
 * @see interface for Peerconnection Service is connection 
 * @since 2021/02/01
 */
public class PropertiesUtil {

    /*
     * @param filename ,propertyname
     * util method
     * @return propertyvalue
     */
    public int getPropertie(String propertyname) {
    	Properties pps = new Properties();
    	String strValue = "";
        try {
            InputStream stream = getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.properties");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
			pps.load(br);
	        strValue = pps.getProperty(propertyname);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return Integer.parseInt(strValue);
    }
    public String getPropertieString(String propertyname) {
    	Properties pps = new Properties();
    	String strValue = "";
        try {
            InputStream stream = getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.properties");
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
			pps.load(br);
	        strValue = pps.getProperty(propertyname);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return strValue;
    }
}