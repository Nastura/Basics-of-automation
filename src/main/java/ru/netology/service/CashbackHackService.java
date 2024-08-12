package ru.netology.service;

import java.util.Locale;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }


    public String name(String name) {
        String nameP = "PETya";
        if (name.equals(nameP)) {
            nameP = name.toLowerCase(Locale.ROOT);
            return nameP;
        } else {
            int lenght = name.length();
            String convert = "" + lenght;
            return convert;
        }
    }
}
