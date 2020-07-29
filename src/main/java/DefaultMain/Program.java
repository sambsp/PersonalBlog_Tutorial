package DefaultMain;

import Database.DatabaseMan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"API", "DefaultMain"})
public class Program  {
    public static void main(String[] args) {
        DatabaseMan.Instance().Init();

        System.out.println("Spring boot application start");
        SpringApplication.run(Program.class, args);
    }
}