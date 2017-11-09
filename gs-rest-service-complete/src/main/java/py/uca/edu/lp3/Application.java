package py.uca.edu.lp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "py.uca.edu.lp3.rest.controller" })
@EnableAutoConfiguration
public class Application {

	//el annotation @ComponentScan le dice a esta aplicación Spring Boot
	//que busque controllers en el paquete especificado
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
