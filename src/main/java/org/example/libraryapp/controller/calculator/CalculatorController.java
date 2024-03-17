package org.example.libraryapp.controller.calculator;

import org.example.libraryapp.dto.calculator.request.CalculatorAddRequest;
import org.example.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // api 진입 지점으로 생각하겠다. api는 controller로 들어오고, controller는 service로 들어간다.
public class CalculatorController {
    @GetMapping("/add") // HTTP Method가 get 방식으로 http path가 /add인 API로 지정
    public int addTwoNumbers(
            CalculatorAddRequest request) {// CalculatorAddRequest 객체를 받아서 request라는 이름으로 사용하겠다.
        return request.getNumber1() + request.getNumber2(); // 받은 request 객체의 number1과 number2를 더해서 반환
    }

    @PostMapping("/multiply") // HTTP Method가 post 방식으로 http path가 /multiply인 API로 지정
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {// CalculatorMultiplyRequest 객체를 받아서 request라는 이름으로 사용하겠다.
        return request.getNumber1() * request.getNumber2(); // 받은 request 객체의 number1과 number2를 곱해서 반환
    }
}
