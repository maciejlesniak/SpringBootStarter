package pl.sparkmedia.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Maciej Lesniak / Spark Media
 * @version 16.04.2016
 */
@SpringBootApplication
public class Application {


	public static void main(String... args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}

}
