package technology.cariad.app.competitiveanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CompetitiveAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompetitiveAnalysisApplication.class, args);
	}

}
