package com.gofly.in.GoFlyEmployeeMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gofly.in.GoFlyEmployeeMS.entity.GoFlyEmployeeFlight;

@SpringBootApplication
public class GoFlyEmployeeMsApplication
{
	private static final Logger log = LoggerFactory.getLogger(GoFlyEmployeeFlight.class);

	public static void main(String[] args) 
	{
		log.info("####"+" "+"GoFlyEmployee"+" "+"#####");
		SpringApplication.run(GoFlyEmployeeMsApplication.class, args);
		System.out.println("==================================");
        System.out.println("Port:8083 Execute Successfully");
        System.out.println("==================================");
	}

}
