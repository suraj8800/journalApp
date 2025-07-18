**Mastering Logging in Spring Boot**
- Logging is an essential aspect of application development, that allows developers to monitor and troubleshoot their application.
- Spring Boot supports various logging frameworks, such as Logback, Log4j2, and Java Util Logging (JUL).
 - _Logback_: A popular logging framework that serves as the default in many Spring Boot application. It offers a flexible configuration and good performance.
 - _Log4j2_: Another widely used logging framework with features such as asynchronous logging and support for various output formats.
 - _Java Util Logging (JUL)_: The default logging framework includes in the java Standard Edition. while it's less feature-rich than some third-party frameworks, it is straightforward and is part of the java platform.

- Spring Boot comes with a default logging configuration that uses Logback as the default logging implementation. It provides a good balance between simplicity and flexibility.
- The default configuration is embedded within the spring boot libraries, and it may not be visible in your projects source code.

- If you want to customize thhe logging configuration, you can create your own logbackspring.xml or **logback.xml** file in the src/main/resources direvtory. when Spring Boot detects this file in your project, it will use it instead of the default configuration.

                                           **LOGGING LEVELS**
  - Logging levels helps in categorizing log statements based on their severity. The common logging levels are
   - TRACE
   - DEBUG
   - INFO
   - WARN
   - ERROR
- we can set the desired logging level for specific packages or classes, allowing them to control the amount of information logged at runtime.
- By default logging is enabled for :- _INFO_, _WARN_, and _ERROR_.
- Spring Boot provides annotaions like _@Slf4j_ & _@Log4j2_. that you can use to automatically inject logger instance into your classes.

- Spring Boot allows us to configure logging using properties or YAML files
  - Examples: logging:
                level:
                  net:
                    engineeringdigest:
                          journalApp: DEBUG
  
  - Example for complete off: logging:
                                level:
                                 root: OFF  
  
- we have so many way to apply so what we need to use at the end so answer is XML
- beacuse its seperate only for log.
- The <configuration> element is the root element of the logback.xml file. All Logback configuration is enclosed within this element.

** MASTER EXTERNAL API INTEGRATION IN SPRING BOOT STEP BY STEP**
We you for practices  1. Wheater API (free but need creadit card), 2.theysaidso Quotes API(not free), 3. wheaterstack API (free), 4 APi-ninja.com for quotes api free