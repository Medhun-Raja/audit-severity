package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuditSeverityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditSeverityApplication.class, args);
		System.out.println("Audit-Severity MS - Started.....");
	}

}
