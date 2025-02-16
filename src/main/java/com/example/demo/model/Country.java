package com.example.demo.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @OneToMany(mappedBy = "country")
    private Set<City> cities;
    public Country() {
    }
    public Country(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<City> getCities() {
        return cities;
    }
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}