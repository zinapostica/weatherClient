package demo;

import demo.consumers.WeatherServiceConsumer;
import demo.models.WeatherData;
import demo.services.JsonDataMapperService;
import demo.services.JsonDataMapperServiceImpl;
import demo.services.WeatherService;
import demo.services.WeatherServiceImpl;

import java.io.IOException;

public class WeatherClient {

    public static void main(String[] args)  {
        WeatherServiceConsumer consumer = new WeatherServiceConsumer(WeatherServiceImpl
                .getNewServiceInstance("Detroit","4e7ed5953d55b45bcfd4db029370afaf"));
        consumer.getWeatherByCityName();
    }
}
