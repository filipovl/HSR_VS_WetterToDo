package de.WetterApp.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class WeatherWebController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model) {
        List<Place> places = weatherService.getAllPlaces();
        model.addAttribute("places", places);
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String placeName, Model model) {
        Place place = weatherService.findPlaceAndSave(placeName);
        model.addAttribute("place", place);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        weatherService.deletePlace(id);
        return "redirect:/";
    }
}