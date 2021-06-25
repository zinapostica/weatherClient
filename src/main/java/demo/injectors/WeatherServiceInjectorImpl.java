package demo.injectors;

import demo.services.JsonDataMapperService;
import demo.services.WeatherService;
import demo.services.WeatherServiceImpl;

public class WeatherServiceInjectorImpl implements WeatherServiceInjector{

    @Override
    public WeatherService getWeatherService(String city, String token, JsonDataMapperService mapper) {
        return new WeatherServiceImpl(city, token, mapper);
    }
}
