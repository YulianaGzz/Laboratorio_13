package com.gremio.agenda_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gremio")
public class AgendaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgendaWebApplication.class, args);
    }
}