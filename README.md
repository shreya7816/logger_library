# logger_library

logger_library is a logging service. It appends the logs based on the input provide in text file.(/home/gmadmin/Documents/demofile/properties.xml)
Run TestClass for a demo.

Format of properties.xml is:
<configuration>
    <property name="LOG_DIRECTORY" value="logs"/>

    <appender name="STDOUT" class="ConsoleAppender">
        <layout class="ch.qos.logback.classic.PatternLayout">
            <Pattern>
                %d{yyyy-MM-dd'T'HH:mm:ss, UTC} [%thread] %-5level %logger %M\(%line\) - %msg%n
            </Pattern>
        </layout>
    </appender>
    <appender name="FILE" class="FileAppender">
        <file>${LOG_DIRECTORY}/expedia-service.log</file>
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <Pattern>
                %d{yyyy-MM-dd'T'HH:mm:ss, UTC} [%thread] %-5level %logger %M\(%line\) - %msg%n
            </Pattern>
        </encoder>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <!-- rollover daily -->
            <FileNamePattern>${LOG_DIRECTORY}/archived/expedia-service.%d{yyyy-MM-dd}.%i.log.gz
            </FileNamePattern>
            <!-- keep 15 days' worth of history -->
            <MaxHistory>15</MaxHistory>
            <!-- or whenever the file size reaches 10MB -->
            <timeBasedFileNamingAndTriggeringPolicy
                    class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
        </rollingPolicy>
    </appender>

</configuration>
