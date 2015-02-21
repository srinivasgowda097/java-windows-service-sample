 package com.benjsicam.javawindowsservice;

import org.springframework.context.annotation.ComponentScan;
//comments import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan(basePackages="com.benjsicam.javawindowsservice")
public class AppConfiguration {
	
}
