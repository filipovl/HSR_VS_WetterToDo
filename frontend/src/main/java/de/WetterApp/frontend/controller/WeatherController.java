package de.WetterApp.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import de.WetterApp.backend.model.Weather;
import de.WetterApp.backend.service.WeatherService;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/all")
    public List<Weather> getAllPlaces() {
        return weatherService.getAllPlaces();
    }

    @GetMapping("/{id}")
    public Weather getPlaceById(@PathVariable Long id) {
        return weatherService.getPlaceById(id);
    }

    @PostMapping("/add")
    public Weather addPlace(@RequestBody Weather weather) {
        return weatherService.savePlace(weather);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePlace(@PathVariable Long id) {
        weatherService.deletePlace(id);
    }
}

