package com.group.libraryapp.dto.calculator.response;

public class CalculatorResponse {
    private final int number_add;
    private final int number_minus;
    private final int number_multiply;

    public CalculatorResponse(int number1, int number2) {
        this.number_add = number1 + number2;
        this.number_minus = number1 - number2;
        this.number_multiply = number1 * number2;
    }

    public int getNumber_add() {
        return number_add;
    }

    public int getNumber_minus() {
        return number_minus;
    }

    public int getNumber_multiply() {
        return number_multiply;
    }
}
