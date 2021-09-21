package com.test.main;

import java.util.Scanner;

public class Samohlasky {
    public static void Run() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] letters = sentence.toLowerCase().toCharArray();
        char[] samohlasky = {'a', 'e', 'i', 'o', 'u','y'};
        int pocet = 0;

        for (char letter : letters
        ) {
            for (char samo : samohlasky
            ) {
                if (letter == samo){
                    pocet++;
                }
            }
        }
        System.out.println(pocet);

    }
}
