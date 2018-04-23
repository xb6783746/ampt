package ru.vsu;

import java.io.IOException;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        if(args.length == 0){

            usage();
            return;
        }

        Ampt ampt = new Ampt();

        ampt.generate(Arrays.asList(args));
    }

    private static void usage(){

        System.out.println("usage:");
        System.out.println("ampt [file]+");
    }
}
