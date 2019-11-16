package com.logger_library.interfaces;

import com.logger_library.models.Message;

public interface Logger extends LogLevel{
	
	public void print(Message msg);
}
