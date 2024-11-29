package main;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        try
        {
            SpringApplication.run(Application.class, args);
        }
        catch (Throwable throwable)
        {
            System.out.println(throwable.toString());
            throwable.printStackTrace();
        }
    }
}
