package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        OrderBuilder builder1 = new StandardOrderBuilder();
        OrderBuilder builder2 = new AccelerateOrderBuilder();

        RepairMan repairMan = new RepairMan(builder1);
        Order order = repairMan.buildOrder();
        if (order != null) {
            System.out.println(order);
        }

        System.out.println();

        repairMan = new RepairMan(builder2);
        order = repairMan.buildOrder();
        if (order != null) {
            System.out.println(order);
        }

    }
}
