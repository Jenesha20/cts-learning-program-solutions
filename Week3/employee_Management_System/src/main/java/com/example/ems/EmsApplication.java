package com.example.ems;

import javax.sql.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }

    @Bean
    public CommandLineRunner checkDataSource(DataSource dataSource) {
        return args -> {
            System.out.println("DataSource configuration:");
            System.out.println("URL: " + dataSource.getConnection().getMetaData().getURL());
            System.out.println("Username: " + dataSource.getConnection().getMetaData().getUserName());
        };
    }
}