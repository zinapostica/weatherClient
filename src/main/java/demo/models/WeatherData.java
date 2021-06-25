package demo.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WeatherData {
    private String temp;
    private String feels_like;
    private String temp_min;
    private String temp_max;
    private String pressure;
    private String humidity;
    private String city;
}
