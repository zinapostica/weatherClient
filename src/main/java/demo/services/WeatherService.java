package demo.services;

import demo.models.WeatherData;

import java.io.IOException;

public interface WeatherService {
    WeatherData getCityWeather() throws IOException, InterruptedException;
}
