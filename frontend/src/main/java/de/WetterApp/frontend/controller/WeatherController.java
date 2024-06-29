package de.WetterApp.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import de.WetterApp.frontend.model.Weather;
import de.WetterApp.frontend.service.BackendService;

import java.util.List;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private BackendService backendService;

    public WeatherController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/items")
    public List<Weather> Weathers() {
        return backendService.getWeathers();
    }

    @GetMapping("/create")
    public Weather createWeather() {
        return backendService.createWeather(new Weather("Test", "Test"));
    }
}
