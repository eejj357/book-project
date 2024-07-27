package com.group.libraryapp.dto.fruit.request;

import java.time.LocalDate;

public class FruitRequest {
    private String name;
    private LocalDate warehosingDate;
    private Long price;

    public String getName() {
        return name;
    }

    public LocalDate getWarehosingDate() {
        return warehosingDate;
    }

    public Long getPrice() {
        return price;
    }

    public FruitRequest(String name, LocalDate warehosingDate, Long price) {
        this.name = name;
        this.warehosingDate = warehosingDate;
        this.price = price;
    }
}
