package org.example.libraryapp.controller.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // api 진입 지점으로 생각하겠다. api는 controller로 들어오고, controller는 service로 들어간다.

public class CalculatorController {
    @GetMapping("/add") // HTTP Method가 get 방식으로 http path가 /add인 API로 지정
    public int addTwoNumbers(
            @RequestParam int number1,
            @RequestParam int number2) { // number1과 number2를 받아서
        return number1 + number2; // a와 b를 더한 값을 반환한다.
    }
}
