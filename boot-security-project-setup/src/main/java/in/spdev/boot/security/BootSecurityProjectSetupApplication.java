package in.spdev.boot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootSecurityProjectSetupApplication {

    @GetMapping("/get")
    public String getResponse(){
        return "Up";
    }

    public static void main(String[] args) {
        SpringApplication.run(BootSecurityProjectSetupApplication.class, args);
    }

}
