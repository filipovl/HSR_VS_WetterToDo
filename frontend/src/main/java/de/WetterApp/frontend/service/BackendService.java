package de.WetterApp.frontend.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.WetterApp.frontend.model.Weather;

@FeignClient(value = "backendService", url = "http://" + "${BACKEND_URL:localhost}" + ":8080/")
public interface BackendService {
    @RequestMapping(method = RequestMethod.GET, value = "/weather")
    List<Weather> getWeather();

    @RequestMapping(method = RequestMethod.POST, value = "/weather")
    TodoItem createWeather(@RequestBody Weather weather);
}