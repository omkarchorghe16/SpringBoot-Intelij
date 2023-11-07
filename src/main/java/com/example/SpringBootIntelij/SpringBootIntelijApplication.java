package com.example.SpringBootIntelij;

import ch.qos.logback.core.net.SyslogOutputStream;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntelijApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootIntelijApplication.class, args);
		System.out.println("Welcome to Intelij IDE");
	}

}
