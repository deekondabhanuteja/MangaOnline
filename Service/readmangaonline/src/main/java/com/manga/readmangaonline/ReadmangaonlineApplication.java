package com.manga.readmangaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ReadmangaonlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadmangaonlineApplication.class, args);
	}

}
