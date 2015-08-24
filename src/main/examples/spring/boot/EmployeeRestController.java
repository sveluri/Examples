package main.examples.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
public class EmployeeRestController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
