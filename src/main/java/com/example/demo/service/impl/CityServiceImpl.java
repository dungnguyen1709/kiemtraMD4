package com.example.demo.service.impl;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }
    @Override
    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }
    @Override
    public void save(City cities) {
        cityRepository.save(cities);
    }
    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }
    @Override
    public Iterable<City> findAllByCountry(Country country) {
        return cityRepository.findAllByCountry(country);
    }
    @Override
    public Iterable<City> findAllByName(String name) {
        return cityRepository.findAllByName(name);
    }
}