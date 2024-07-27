package com.group.libraryapp.dto.date.response;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateResponse {
    private String dayOfTheWeek;

    public DateResponse(LocalDate date) {
        DayOfWeek tmp = date.getDayOfWeek();
        this.dayOfTheWeek = tmp.toString().substring(0, 3);
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

}


