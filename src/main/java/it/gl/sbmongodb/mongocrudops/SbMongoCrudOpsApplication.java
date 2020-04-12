package it.gl.sbmongodb.mongocrudops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;

//import it.gl.sbmongodb.mongocrudops.dao.ImpiegatoDAO;

//@Configuration
@SpringBootApplication
//@EnableMongoRepositories(basePackages = "it.gl.sbmongodb.mongocrudops")
//@ComponentScan(basePackages = "it.gl.sbmongodb.mongocrudops")
public class SbMongoCrudOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMongoCrudOpsApplication.class, args);
	}

}
