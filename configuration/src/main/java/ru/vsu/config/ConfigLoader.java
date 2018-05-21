package ru.vsu.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.vsu.config.entity.Configuration;

import java.io.File;
import java.io.IOException;

public class ConfigLoader {


    public Configuration getConfiguration(File file) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(file, Configuration.class);
    }

}
