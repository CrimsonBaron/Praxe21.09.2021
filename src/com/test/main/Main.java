package com.test.main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        if (args[0].equals("k")){
            Kalkulator.Run(args);
        }else if (args[0].equals("s")){
            Samohlasky.Run();
        }else{
            System.out.println("Bad argggggggggggggggggggggggg");
            System.exit(0);
        }
        System.out.println("zmena");
    }

}
