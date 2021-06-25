package demo.injectors;

import demo.services.JsonDataMapperService;
import demo.services.WeatherService;
import demo.services.WeatherServiceImpl;

public interface WeatherServiceInjector {
    WeatherService getWeatherService(String city, String token, JsonDataMapperService mapper);
}
