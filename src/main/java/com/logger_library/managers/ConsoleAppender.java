package com.logger_library.managers;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.logger_library.enums.LoggerLevel;
import com.logger_library.enums.LoggerName;
import com.logger_library.interfaces.Logger;
import com.logger_library.models.Message;

/**
 *  Singleton class ConsoleAppender Append logs to console
 *
 */
@Service
public class ConsoleAppender implements Logger{
	
	private String nameSpace;
	
	private static ConsoleAppender consoleAppender;  
	
	private ConsoleAppender(String nameSpace){
		this.nameSpace = nameSpace;
	}
	
	public static ConsoleAppender getInstance(String nameSpace) {
		if(consoleAppender == null)
			return new ConsoleAppender(nameSpace);
		else
			return consoleAppender;
	}

	@Override
	public void info(String message) {
		Message msg = Message.builder()
				.logLevel(LoggerLevel.INFO)
				.nameSpace(this.nameSpace)
				.timeStamp(String.valueOf(new Date()))
				.content(message)
				.build();
		print(msg);
	}

	@Override
	public void error(String message) {
		Message msg = Message.builder()
				.logLevel(LoggerLevel.ERROR)
				.nameSpace(this.nameSpace)
				.timeStamp(String.valueOf(new Date()))
				.content(message)
				.build();
		print(msg);
		
	}

	@Override
	public void print(Message msg) {
		System.out.println( msg.getTimeStamp() +" " +msg.getLogLevel() +" "
				+msg.getNameSpace() +" - " +msg.getContent());
	}

	@Override
	public LoggerName loggerName() {
		return LoggerName.valueOf("CONSOLE_APPENDER");
	}

}
