package com.gk.website.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {

        // These are optional unless you're explicitly using System.getProperty()
        System.setProperty("DB_URL", System.getenv("DB_URL"));
        System.setProperty("DB_USERNAME", System.getenv("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", System.getenv("DB_PASSWORD"));
        System.setProperty("EMAIL_USERNAME", System.getenv("EMAIL_USERNAME"));
        System.setProperty("EMAIL_PASSWORD", System.getenv("EMAIL_PASSWORD"));

        SpringApplication.run(PortfolioApplication.class, args);
    }
}
