package demo.services;

import demo.models.WeatherData;

import java.io.IOException;

public interface JsonDataMapperService {
    WeatherData mapJson(String json) throws IOException;
}
