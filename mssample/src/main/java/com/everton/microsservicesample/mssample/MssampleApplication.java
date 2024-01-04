package com.everton.microsservicesample.mssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.everton.microsservicesample.core.model"})
@EnableJpaRepositories({"com.everton.microsservicesample.core.repository"})
public class MssampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MssampleApplication.class, args);
	}

}
