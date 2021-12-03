package ru.geekbrains;

public class Order {
    private String stateOrder;
    public String getStateOrder() {
        return stateOrder;
    }
    public void setStateOrder(String newStateOrder) {
        stateOrder = newStateOrder;
    }
    public Memento createMemento(){
        return new Memento(stateOrder);
    }
    public void setMemento(Memento memento){
        stateOrder=memento.getStateOrder();
    }
}
