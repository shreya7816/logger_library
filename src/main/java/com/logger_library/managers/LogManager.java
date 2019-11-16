package com.logger_library.managers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.logger_library.interfaces.Logger;

public class LogManager {
	
	public static Logger getLogger(Class<?> className) {
		
		try (FileReader reader = new FileReader("/home/gmadmin/Documents/demofile/properties.txt");
				BufferedReader br = new BufferedReader(reader)) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
		return ConsoleAppender.getInstance(className.getSimpleName());
	}

}
