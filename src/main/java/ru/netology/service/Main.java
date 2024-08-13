package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        System.out.println("Для получения максимального количество кэшбэка, Вам необходимо докупить на " + service.remain(1111) + " руб.");
    }
}