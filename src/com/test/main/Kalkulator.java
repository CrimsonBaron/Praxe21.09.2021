package com.test.main;

import java.util.Scanner;

public class Kalkulator {
    public static void Run(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (Kalkulator.CheckArgCalculator(args[1])) {
            int a, b, result = 0;

            a = sc.nextInt();
            b = sc.nextInt();
            boolean badArg = false;

            switch (args[1].trim()) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "d":
                    result = a / b;
                    break;
                default:
                    System.out.println("bad arg");
                    break;

            }
            System.out.println(result);


        } else {
            System.out.println("bad arg");
            System.exit(0);
        }
    }

    public static boolean CheckArgCalculator(String arg) {
        String arguments[] = {"+", "*", "-", "d"};
        for (String argument : arguments
        ) {
            if (arg.equals(argument)) {
                return true;
            }
        }
        return false;
    }
}
