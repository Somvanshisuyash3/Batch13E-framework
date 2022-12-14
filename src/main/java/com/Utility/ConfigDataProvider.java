package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String filepath="D:\\Batch_13E_Framework\\Config\\config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}

	public String getQA1_Url() {
		return pro.getProperty("QA1_Url");
	}
}
