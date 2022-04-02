package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCalculator {
    @GetMapping
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/calculator")
    public String helloCalculatore() {
        return "Добро пожаловать в калькулятор!";
    }
}
