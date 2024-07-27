package com.group.libraryapp.dto.calculator.response;

import java.util.List;

public class TotalSumResponse {
    private int totalSum;

    public TotalSumResponse(List<Integer> numbers) {
        this.totalSum = numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public int getTotalSum() {
        return totalSum;
    }
}
