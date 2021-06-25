package demo.consumers;

import demo.models.WeatherData;
import demo.services.JsonDataMapperService;
import demo.services.WeatherService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherServiceConsumer {
    private WeatherService weatherService;


    public void getWeatherByCityName() throws IOException, InterruptedException {
        WeatherData weatherData = weatherService.getCityWeather();
        if (weatherData != null)
            System.out.println(weatherData);
    }
}
