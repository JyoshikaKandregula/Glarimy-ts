package com.glarimy.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class EchoServer {

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable("name") String name) {
        // Get the current time with seconds
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentTime = now.format(formatter);
        
        return "Hello, " + name + "! Current time is: " + currentTime + "\n";
    }
}
