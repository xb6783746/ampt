package ru.vsu.codegenerator.builder;

public class ImportStatement {


    private String what;
    private String from;
    private String as;

    public ImportStatement(String what, String as) {

        this(what, null, as);
    }

    public ImportStatement(String what, String from, String as) {
        this.what = what;
        this.from = from;
        this.as = as;
    }

    public String getWhat() {
        return what;
    }

    public String getFrom() {
        return from;
    }

    public String getAs() {
        return as;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        if(from != null){

            builder.append("from ").append(from).append(" ");
        }

        builder.append("import ").append(what);

        if(as != null){

            builder.append(" as ").append(as);
        }

        return builder.toString();
    }
}
