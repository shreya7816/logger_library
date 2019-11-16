package com.logger_library.models;

import com.logger_library.enums.LoggerLevel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
	
	String timeStamp;
	LoggerLevel logLevel;
	String nameSpace;
	String content;
	
}
