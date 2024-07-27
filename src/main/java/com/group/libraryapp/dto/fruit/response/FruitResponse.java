package com.group.libraryapp.dto.fruit.response;

public class FruitResponse {
    private int salesAmount;
    private int nonSalesAmount;

    public FruitResponse(int salesAmount, int nonSalesAmount) {
        this.salesAmount = salesAmount;
        this.nonSalesAmount = nonSalesAmount;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public int getNonSalesAmount() {
        return nonSalesAmount;
    }
}
