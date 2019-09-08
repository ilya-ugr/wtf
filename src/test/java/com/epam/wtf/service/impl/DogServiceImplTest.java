package com.epam.wtf.service.impl;

import com.epam.wtf.model.Dog;
import com.epam.wtf.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DogServiceImplTest {

    @Mock
    private DogService dogs;

    @InjectMocks
    DogServiceImpl dogService = new DogServiceImpl(dogs);

    @Test
    public void getDogNames() {
        when(dogService.getDogNames()).thenReturn(Arrays.asList("Barsik", "Murzik"));
        assertEquals(Arrays.asList("Barsik", "Murzik"), dogService.getDogNames());
        verify(dogs, atLeastOnce()).getDogNames();

    }

    @Test
    public void getDogCounts() {
        when(dogService.getDogCounts()).thenReturn(10);
        assertEquals(10, dogService.getDogCounts());
        verify(dogs).getDogCounts();
    }

    @Test
    public void getDogCounts1() {
        when(dogService.getDogCounts("Barsik")).thenReturn(1);
        assertEquals(1, dogService.getDogCounts("Barsik"));
        verify(dogs).getDogCounts("Barsik");
    }

    @Test
    public void addDog() {
        Dog barsik = new Dog();
        when(dogService.addDog("Barsik")).thenReturn(barsik);
        assertEquals(barsik, dogService.addDog("Barsik"));
        verify(dogs).addDog("Barsik");
    }
}