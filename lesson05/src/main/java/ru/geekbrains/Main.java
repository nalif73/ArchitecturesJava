package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
//Инициализация с начальным состоянием
        Order order = new Order();
        order.setStateOrder("Телефон принят в работу");
        System.out.println(order.getStateOrder());
//Инициализация отката и сохранение текущего состояния
        Creator creator = new Creator();
        creator.setMemento(order.createMemento());
        order.setStateOrder("В работе");
        System.out.println(order.getStateOrder());
//Восстановление ранее сохранённого состояния
        order.setMemento(creator.getMemento());
        System.out.println(order.getStateOrder());
    }
}
