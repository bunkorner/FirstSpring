package helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Addr(String firstLine, String city){ };
@Configuration
public class HelloWorldConfiguration {
    @Bean(name="myName")
    public String name() {
        return "Lgbtq";
    }
    @Bean
    public String city() {
        return "London";
    }
    @Bean
    public int age() {
        return 22;
    }
    @Bean
    public Addr Ad() {
        return new Addr("BusStand", "Bangalore");
    }
    @Bean
    public Addr bad() {
        return new Addr("Buffer", "Lucknow");
    }
    @Bean
    public Addr mad(String myName, String city) {
        return new Addr(myName, city);
    }
}
