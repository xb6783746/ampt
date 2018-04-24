package ru.vsu.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.vsu.config.entity.FunctionsConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigLoader {


    public FunctionsConfiguration getFunctionConfiguration(File file) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(file, FunctionsConfiguration.class);
    }
}
