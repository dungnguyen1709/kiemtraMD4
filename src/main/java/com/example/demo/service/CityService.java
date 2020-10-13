package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.model.Country;

public interface CityService {
    Iterable<City> findAll();
    City findById(Long id);
    void save(City cities);
    void remove(Long id);
    Iterable<City> findAllByCountry(Country country);
    Iterable<City> findAllByName(String name);
}
