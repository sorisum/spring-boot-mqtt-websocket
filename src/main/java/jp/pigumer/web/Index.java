package jp.pigumer.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@ComponentScan
@Controller
@EnableAutoConfiguration
@Configuration
public class Index {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @Bean
    public ServerEndpointExporter endpointExporterInitializer() {
        return new ServerEndpointExporter();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Index.class, args);
    }
}
