package demo;

import demo.consumers.WeatherServiceConsumer;
import demo.injectors.JsonDataMapperInjector;
import demo.injectors.JsonDataMapperInjectorImpl;
import demo.injectors.WeatherServiceInjector;
import demo.injectors.WeatherServiceInjectorImpl;
import demo.services.WeatherService;
import demo.services.WeatherServiceImpl;

import java.io.IOException;

public class WeatherClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        WeatherServiceInjector weatherServiceInjector = new WeatherServiceInjectorImpl();
        JsonDataMapperInjector jsonDataMapperInjector = new JsonDataMapperInjectorImpl();
        WeatherServiceConsumer consumer = new WeatherServiceConsumer(
                weatherServiceInjector.getWeatherService("Detroit", "yourtoken",
                        jsonDataMapperInjector.getJsonDataMapperService()));
        consumer.getWeatherByCityName();
    }
}
