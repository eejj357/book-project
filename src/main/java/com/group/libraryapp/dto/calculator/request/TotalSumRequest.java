package com.group.libraryapp.dto.calculator.request;

import java.util.List;

public class TotalSumRequest {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
