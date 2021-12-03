package ru.geekbrains;

public class Apple implements Phone {

    @Override
    public void repairScreen() {
        System.out.println("Ремонтируем экран телефона Apple");
    }

    @Override
    public void repairTouchScreen() {
        System.out.println("Ремонтируем тач телефона Apple");
    }

    @Override
    public void repairSpeaker() {
        System.out.println("Ремонтируем динамик телефона Apple");
    }
}
