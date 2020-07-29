package com.logger_library.managers;

import org.springframework.stereotype.Component;

@Component
public class LogManager {
	
//	public static List<Logger> loggerList;
	
//	public static Logger getLogger(Class<?> className) {
//			File file = new File("/home/gmadmin/Documents/demofile/properties.xml");
//			Configuration configuration = (Configuration) MarshalUnmarshalUtils.unMarshalLogProperties(file);
//			List<Configuration.Appender> appenders = configuration.getAppender();
//			for(Configuration.Appender appender : appenders) {
//				Logger logger = CommonUtils.getLogger(appender,loggerList);
//			}
//			
//		return ConsoleAppender.getInstance(className.getSimpleName());
//	}
	
	public static Log getLogger(Class<?> className) {
		return Log.getInstance(className.getClass().getSimpleName());
		//return new Log(className.getClass().getSimpleName());
	}
	

}
