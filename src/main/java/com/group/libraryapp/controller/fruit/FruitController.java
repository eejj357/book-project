package com.group.libraryapp.controller.fruit;

import com.group.libraryapp.dto.fruit.request.FruitRequest;
import com.group.libraryapp.dto.fruit.request.SoldFruitRequest;
import com.group.libraryapp.dto.fruit.response.FruitResponse;
import com.group.libraryapp.service.fruit.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruitInfo(@RequestBody FruitRequest request) {
        fruitService.saveFruitInfo(request);
    }

    @PutMapping("/api/v1/fruit")
    public void saveSoldFruit(@RequestBody SoldFruitRequest request) {
        fruitService.saveSoldFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public List<FruitResponse> showSalesAmount(@RequestParam String name) {
        return fruitService.showSalesAmount(name);
    }
}