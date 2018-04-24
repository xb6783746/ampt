package ru.vsu.config.entity;

import java.util.List;

public class FunctionsConfiguration {

    private String coreName;
    private String numpyName;
    private String apmtlibName;
    private List<FunctionConfigurationEntry> functions;

    public String getCoreName() {
        return coreName;
    }

    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }

    public String getNumpyName() {
        return numpyName;
    }

    public void setNumpyName(String numpyName) {
        this.numpyName = numpyName;
    }

    public String getApmtlibName() {
        return apmtlibName;
    }

    public void setApmtlibName(String apmtlibName) {
        this.apmtlibName = apmtlibName;
    }

    public List<FunctionConfigurationEntry> getFunctions() {
        return functions;
    }

    public void setFunctions(List<FunctionConfigurationEntry> functions) {
        this.functions = functions;
    }
}
