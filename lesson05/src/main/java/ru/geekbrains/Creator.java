package ru.geekbrains;

public class Creator {
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento newMemento) {
        memento = newMemento;
    }
}
