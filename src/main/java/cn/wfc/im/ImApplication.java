package cn.wfc.im;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.ServerSocket;

@SpringBootApplication
public class ImApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImApplication.class,args);
    }


    @PostConstruct
    @Bean
    public ServerSocket getServerSocket() throws IOException {
        ServerSocket server = new ServerSocket(8899);
        return server;
    }
}
