package demo.services;

import demo.models.WeatherData;
import lombok.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private static final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather";
    private static final String units = "metric";
    private String name;
    private String token;
    private JsonDataMapperService mapper;


    public WeatherData getCityWeather() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(WEATHER_API_URL + "?q=" + this.name + "&appid=" + this.token + "&units=" + units))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 200) {
            WeatherData weatherData = mapper.mapJson(response.body());
            weatherData.setCity("Detroit");
            return weatherData;
        } else {
            System.out.println("Failed to fetch data");
            return null;
        }
    }

}
