package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.TotalSumRequest;
import com.group.libraryapp.dto.calculator.response.CalculatorResponse;
import com.group.libraryapp.dto.calculator.response.TotalSumResponse;
import org.springframework.web.bind.annotation.*;

// 이 클래스를 API의 진입 지점으로 만드는 것!
@RestController
public class CalculatorController {
    @GetMapping("/add")  // GET /add
    public int addTwoNumbers(CalculatorAddRequest request) {
            return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")  // POST /multiply
    public int multipltTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
            return request.getNumber1() * request.getNumber2();
    }

    @GetMapping("/api/v1/calc")  // GET /api/v1/calc
    public CalculatorResponse calculateTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        CalculatorResponse request = new CalculatorResponse(num1, num2);
        return request;
    }

    @PostMapping("/api/v1/totalsum")  // POST /api/v1/totalsum
    public int getTotalSum(@RequestBody TotalSumRequest request) {
        TotalSumResponse totalSum = new TotalSumResponse(request.getNumbers());
        return totalSum.getTotalSum();
    }
}
