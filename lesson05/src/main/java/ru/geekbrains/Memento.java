package ru.geekbrains;

public class Memento {
    private String stateOrder;
    public Memento(String newStateOrder){
        stateOrder=newStateOrder;
    }
    public String getStateOrder(){
        return stateOrder;
    }
}
