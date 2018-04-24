package ru.vsu;

import ru.vsu.interfaces.ConsoleInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    static String outDir = "";
    static List<String> files = new ArrayList<>();

    public static void main( String[] args ) throws IOException {

        if(args.length == 0){

            usage();
            return;
        }

        ConsoleInterface consoleInterface = new ConsoleInterface("-");

        consoleInterface
                .registerMainHandler(files::add)
                .registerHandler("o", App::setOutDir);

        consoleInterface.parse(args);

        Ampt ampt = new Ampt();

        ampt.generate(files, outDir);
    }

    private static void usage(){

        System.out.println("usage:");
        System.out.println("ampt [-o out_dir]? [file]+");
    }

    private static void setOutDir(String arg){

        outDir = arg;
    }
}
