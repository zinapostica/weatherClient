package demo.injectors;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo.injectors.JsonDataMapperInjector;
import demo.services.JsonDataMapperService;
import demo.services.JsonDataMapperServiceImpl;

public class JsonDataMapperInjectorImpl implements JsonDataMapperInjector {

    @Override
    public JsonDataMapperService getJsonDataMapperService() {
        return new JsonDataMapperServiceImpl(new ObjectMapper());
    }
}
