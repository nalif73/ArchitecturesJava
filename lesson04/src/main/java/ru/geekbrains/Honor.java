package ru.geekbrains;

public class Honor implements Phone {

    @Override
    public void repairScreen() {
        System.out.println("Ремонтируем экран телефона Honor");
    }

    @Override
    public void repairTouchScreen() {
        System.out.println("Ремонтируем тач телефона Honor");
    }

    @Override
    public void repairSpeaker() {
        System.out.println("Ремонтируем динамик телефона Honor");
    }
}
