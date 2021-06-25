package demo.injectors;

import demo.services.JsonDataMapperService;

public interface JsonDataMapperInjector {
    JsonDataMapperService getJsonDataMapperService();
}
