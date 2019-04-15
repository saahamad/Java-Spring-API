package com.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to Spring boot!!!!");
    	SpringApplication.run(App.class, args);
    	System.out.println("Spring boot started!!!!");
    }
}
