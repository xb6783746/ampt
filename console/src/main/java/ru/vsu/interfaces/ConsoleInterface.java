package ru.vsu.interfaces;

import java.util.Hashtable;
import java.util.Map;
import java.util.function.Consumer;

public class ConsoleInterface {

    public ConsoleInterface(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    private String keyPrefix;
    private Consumer<String> mainHandler = null;
    private Map<String, Consumer<String>> handlers = new Hashtable<>();

    public ConsoleInterface registerMainHandler(Consumer<String> handler){

        mainHandler = handler;

        return this;
    }

    public ConsoleInterface registerHandler(String key, Consumer<String> handler){

        handlers.put(keyPrefix + key, handler);

        return this;
    }

    public void parse(String[] input){

        Consumer<String> handler = null;

        for(String str: input){

            if(handler != null){

                handler.accept(str);
                handler = null;
            } else if(handlers.containsKey(str)){

                handler = handlers.get(str);
            } else {

                mainHandler.accept(str);
            }
        }
    }
}
