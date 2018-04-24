package ru.vsu.helpers;


import ru.vsu.config.entity.FunctionConfigurationEntry;
import ru.vsu.config.entity.FunctionsConfiguration;

import java.util.Hashtable;
import java.util.Map;

public class FunctionNameResolver {

    public static class Replace {

        public Replace(String funcName, boolean needWrapToMlarr) {
            this.funcName = funcName;
            this.needWrapToMlarr = needWrapToMlarr;
        }

        private String funcName;
        private boolean needWrapToMlarr;

        public String getFuncName() {
            return funcName;
        }

        public boolean isNeedWrapToMlarr() {
            return needWrapToMlarr;
        }
    }


    public FunctionNameResolver(FunctionsConfiguration entity){

        prefixes.put("python", "");
        prefixes.put("numpy", entity.getNumpyName());
        prefixes.put("apmtlib", entity.getApmtlibName());
        prefixes.put("core", "");

        for(FunctionConfigurationEntry entry: entity.getFunctions()){

            functions.put(
                    entry.getMatlabName(),
                    new Replace(buildName(prefixes, entry), entry.getNeedWrap())
            );
        }
    }

    private Map<String, String> prefixes = new Hashtable<>();
    private Map<String, Replace> functions = new Hashtable<>();

    public Replace resolve(String name){

        return functions.getOrDefault(name, null);
    }

    private String buildName(Map<String, String> prefixes, FunctionConfigurationEntry entry){

        if(prefixes.get(entry.getFrom()).isEmpty()){

            return entry.getGeneratedName();
        }

        return prefixes.get(entry.getFrom()).concat(".").concat(entry.getGeneratedName());
    }
}
