package com.fstg.JobOfferManagement;



import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JobOfferManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobOfferManagementApplication.class, args);
		
		
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
