package com.madanrajma.springlearning;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringlearningApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringlearningApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringlearningApplication.class, args);
	}

	public void displayDate() {

		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		String date = format.format(new Date());

		System.out.println(date);
		LOGGER.debug(date);

		LOGGER.info("END");

	}

	public void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());

	}

}
