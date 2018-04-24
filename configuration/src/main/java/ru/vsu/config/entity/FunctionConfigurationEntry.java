package ru.vsu.config.entity;

public class FunctionConfigurationEntry {

    private String matlabName;
    private String generatedName;
    private String from;
    private Boolean needWrap;

    public String getMatlabName() {
        return matlabName;
    }

    public void setMatlabName(String matlabName) {
        this.matlabName = matlabName;
    }

    public String getGeneratedName() {
        return generatedName;
    }

    public void setGeneratedName(String generatedName) {
        this.generatedName = generatedName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Boolean getNeedWrap() {
        return needWrap;
    }

    public void setNeedWrap(Boolean needWrap) {
        this.needWrap = needWrap;
    }
}
