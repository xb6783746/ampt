package ru.vsu.config.entity;

import java.util.List;

public class Configuration {

    private String coreName;
    private String numpyName;
    private String apmtlibName;
    private List<String> standardFunctions;

    public String getCoreName() {
        return coreName;
    }
    public String getNumpyName() {
        return numpyName;
    }
    public String getApmtlibName() {
        return apmtlibName;
    }

    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }

    public void setNumpyName(String numpyName) {
        this.numpyName = numpyName;
    }

    public void setApmtlibName(String apmtlibName) {
        this.apmtlibName = apmtlibName;
    }

    public void setStandardFunctions(List<String> standardFunctions) {
        this.standardFunctions = standardFunctions;
    }

    public List<String> getStandardFunctions() {
        return standardFunctions;
    }
}
