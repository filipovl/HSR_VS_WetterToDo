package de.WetterApp.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.WetterApp.backend.model.Weather;
import de.WetterApp.backend.repository.WeatherRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public List<Weather> getAllPlaces() {
        return weatherRepository.findAll(); 
    }

    public Weather getPlaceById(Long id) {
        Optional<Weather> optionalWeather = weatherRepository.findById(id); 
        return optionalWeather.orElse(null);
    }

    public Weather savePlace(Weather weather) {
        return weatherRepository.save(weather); 
    }

    public void deletePlace(Long id) {
        weatherRepository.deleteById(id); 
    }
}

