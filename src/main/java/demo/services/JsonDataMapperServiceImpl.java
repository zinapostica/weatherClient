package demo.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.models.WeatherData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@Getter
@Setter
public class JsonDataMapperServiceImpl implements JsonDataMapperService{
   private ObjectMapper objectMapper;
    @Override
    public WeatherData mapJson(String json) throws IOException {
        JsonNode rootNode = objectMapper.readTree(json);
        WeatherData weatherData = objectMapper.readValue(rootNode.get("main").toString(), WeatherData.class);
        return weatherData;
    }

    public JsonDataMapperServiceImpl() {
        this.objectMapper = new ObjectMapper();
    }
}
