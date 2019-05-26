package com.simonblund.dahapp;

import com.simonblund.dahapp.models.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.simonblund.dahap.data")
@SpringBootApplication
public class DahappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DahappApplication.class, args);
	}

}
