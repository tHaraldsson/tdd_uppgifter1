package com.demo.uppgifter.bankapp.utils;

import java.util.Scanner;

public class Utils {

    static Scanner sc = new Scanner(System.in);

    public static String inputScanner() {

        return sc.nextLine();
    }

    public static void closeScanner() {
        sc.close();
    }
}
