package com.logger_library.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.logger_library.generated_classes.Configuration;

public class MarshalUnmarshalUtils {
	
	public static JAXBContext logJAXBContext = null;
	
	static {
		try {
			logJAXBContext = JAXBContext.newInstance(Configuration.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static Unmarshaller createMarshaller(JAXBContext jaxbContext) {
		Unmarshaller unMarshaller = null;
		try {
			unMarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return unMarshaller;
	}
	
	public static <T>T unMarshalLogProperties(File file){
		T t = null;
		Unmarshaller unMarshaller = createMarshaller(logJAXBContext);
		try {
			t = (T) unMarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return t;
		
	}

}
