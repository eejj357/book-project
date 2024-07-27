package com.group.libraryapp.controller.date;

import com.group.libraryapp.dto.date.response.DateResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DateController {
    @GetMapping("/api/v1/day-of-the-week")  // GET /api/v1/day-of-the-week
    public DateResponse getDayOfTheWeek(@RequestParam String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        DateResponse response = new DateResponse(parsedDate);
        return response;
    }
}
