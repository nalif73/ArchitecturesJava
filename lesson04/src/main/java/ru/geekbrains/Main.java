package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        ConcreteRepair repair1 = new ConcreteRepair(new Apple());
        repair1.repairSpeaker();
        repair1.repairTouchScreen();

        ConcreteRepair repair2 = new ConcreteRepair(new Samsung());
        repair2.repairSpeaker();

        ConcreteRepair repair3 = new ConcreteRepair(new Honor());
        repair3.repairScreen();


    }

}
