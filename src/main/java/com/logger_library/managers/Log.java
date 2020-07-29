package com.logger_library.managers;

import java.io.File;
import java.util.List;

import com.logger_library.generated_classes.Configuration;
import com.logger_library.interfaces.Logger;
import com.logger_library.utils.CommonUtils;
import com.logger_library.utils.MarshalUnmarshalUtils;

public class Log {
	
	private Log(String className) {
		this.nameSpace = className;
	}
	
	private static Log log;
	
//	private List<Logger> loggerList;
	
	String nameSpace;
	
	public static Log getInstance(String className) {
		if(log == null) {
			return new Log(className);
		}else
			return log;
	}
	
	public void info(String message) {
		File file = new File("/home/gmadmin/Documents/demofile/properties.xml");
		Configuration configuration = (Configuration) MarshalUnmarshalUtils.unMarshalLogProperties(file);
		List<Configuration.Appender> appenders = configuration.getAppender();
		for(Configuration.Appender appender : appenders) {
			Logger logger = CommonUtils.getLogger(appender, nameSpace);
			logger.info(message);
		}
	}
	
	public void error(String message) {
		
	}

}
