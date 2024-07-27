package com.group.libraryapp.service.fruit;

import com.group.libraryapp.dto.fruit.request.FruitRequest;
import com.group.libraryapp.dto.fruit.request.SoldFruitRequest;
import com.group.libraryapp.dto.fruit.response.FruitResponse;
import com.group.libraryapp.repository.fruit.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public void saveFruitInfo(FruitRequest request) {
        fruitRepository.saveFruitInfo(request.getName(), request.getWarehosingDate(), request.getPrice());
    }

    public void saveSoldFruit(SoldFruitRequest request) {
        fruitRepository.saveSoldFruit(request.getId());
    }

    public List<FruitResponse> showSalesAmount(String name) {
        return fruitRepository.showSalesAmount(name);
    }
}