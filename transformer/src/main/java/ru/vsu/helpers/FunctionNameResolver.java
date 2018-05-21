package ru.vsu.helpers;


import ru.vsu.config.entity.Configuration;

import java.util.Hashtable;
import java.util.Map;

public class FunctionNameResolver {

    public FunctionNameResolver(Configuration entity){


        String prefix = entity.getApmtlibName().isEmpty()?
                "" : entity.getApmtlibName()+ ".";

        for(String entry: entity.getStandardFunctions()){

            functions.put(
                    entry,
                    prefix + entry
            );
        }
    }

    private Map<String, String> functions = new Hashtable<>();

    public String resolve(String name){

        return functions.getOrDefault(name, name);
    }

}
