package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("demo")
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
    	System.out.println("Hello World");
    	System.out.println("Im Back");
        SpringApplication.run(Demo1Application.class, args);
    }
}
