package ru.geekbrains;

public class Samsung implements Phone {

    @Override
    public void repairScreen() {
        System.out.println("Ремонтируем экран телефона Samsung");
    }

    @Override
    public void repairTouchScreen() {
        System.out.println("Ремонтируем тач телефона Samsung");
    }

    @Override
    public void repairSpeaker() {
        System.out.println("Ремонтируем динамик телефона Samsung");
    }
}
