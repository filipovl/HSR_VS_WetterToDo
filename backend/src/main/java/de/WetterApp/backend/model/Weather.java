package de.WetterApp.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double todayTemperature;
    private Double tomorrowTemperature;
    private Integer uvIndex;

    // Getter und Setter
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

    public Double getTodayTemperature() {
        return todayTemperature;
    }

    public void setTodayTemperature(Double todayTemperature) {
        this.todayTemperature = todayTemperature;
    }

    public Double getTomorrowTemperature() {
        return tomorrowTemperature;
    }

    public void setTomorrowTemperature(Double tomorrowTemperature) {
        this.tomorrowTemperature = tomorrowTemperature;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }
}
