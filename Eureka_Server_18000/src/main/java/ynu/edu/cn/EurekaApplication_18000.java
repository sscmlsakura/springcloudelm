package ynu.edu.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_18000 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_18000.class,args);
    }
}
