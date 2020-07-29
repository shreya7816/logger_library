package com.logger_library.utils;

import com.logger_library.enums.LoggerName;
import com.logger_library.generated_classes.Configuration.Appender;
import com.logger_library.interfaces.Logger;
import com.logger_library.managers.ConsoleAppender;


public class CommonUtils {

	public static Logger getLogger(Appender appender, String nameSpace) {
		if(appender.getClazz().toString().equalsIgnoreCase(LoggerName.CONSOLE_APPENDER.getValue()))
				return ConsoleAppender.getInstance(nameSpace);
		if(appender.getClazz().toString().equalsIgnoreCase(LoggerName.FILE_APPENDER.getValue()))
			return ConsoleAppender.getInstance(nameSpace);
		
		return null;
	}

}
