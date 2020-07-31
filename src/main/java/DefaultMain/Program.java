package DefaultMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"API", "Exception", "DefaultMain"})
public class Program  {
    public static void main(String[] args) {
        System.out.println("Spring boot application start");
        SpringApplication.run(Program.class, args);
    }
}