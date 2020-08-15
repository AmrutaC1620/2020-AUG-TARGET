package com.target.training.util;

import java.util.Scanner;

public final class KeyboardUtil {

    private KeyboardUtil() {
    }

    public static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine(); // reads line from the source
    }

    public static int getInt(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
