package de.WetterApp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.WetterApp.backend.model.Weather;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
