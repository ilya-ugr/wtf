package com.epam.wtf.service.impl;

import com.epam.wtf.model.Dog;
import com.epam.wtf.service.DogService;

import java.util.List;

public class DogServiceImpl implements DogService {
    private DogService dogService;

    public DogServiceImpl(DogService dogService) {
        this.dogService = dogService;
    }

    @Override
    public List<String> getDogNames() {
        return dogService.getDogNames();
    }

    @Override
    public int getDogCounts() {
        return dogService.getDogCounts();
    }

    @Override
    public int getDogCounts(String name) {
        return dogService.getDogCounts(name);
    }

    @Override
    public Dog addDog(String vaccine) {
        return dogService.addDog(vaccine);
    }
}
