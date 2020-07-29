package com.logger_library.enums;

import lombok.Getter;

@Getter
public enum LoggerName {
	CONSOLE_APPENDER("ConsoleAppender"),
	FILE_APPENDER("FileAppender");
	
	private final String value;
	
	private LoggerName(String value) {
		this.value = value;
	}
}
