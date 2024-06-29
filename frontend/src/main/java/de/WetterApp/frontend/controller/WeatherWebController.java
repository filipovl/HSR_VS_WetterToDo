package de.WetterApp.frontend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.WetterApp.frontend.model.Weather;
import de.WetterApp.frontend.service.BackendService;

@Controller
public class WeatherWebController {
    private static final Logger log = LoggerFactory.getLogger(WeatherWebController.class);

    private final BackendService backendService;

    public WeatherWebController(BackendService backendService) {
        this.backendService = backendService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/weather")
    public String todoItemList(Model model) {
        log.info("Received GET request on /weathers. Serving Weathers.html");
        model.addAttribute("todo", new TodoItem("", ""));
        model.addAttribute("todos", backendService.getTodoItems());
        return "todoItems";
    }

    @PostMapping("/weathers")
    public String createWeather(Model model, @ModelAttribute("weather") Weather weather) {
        log.info("Received POST request on /weathers with weather(name: {}, description: {}", weather.getWeatherName(), todoItem.getWeatherDescription());
        backendService.createWeather(todoItem);
        log.info("Redirecting to /weathers");
        return "redirect:/weathers";
    }
}