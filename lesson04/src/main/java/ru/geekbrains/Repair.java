package ru.geekbrains;

public abstract class Repair {

    private Phone phone;

    public void setPhone(Phone phone) {
        this.phone=phone;
    }
    public void repairScreen() {
        phone.repairScreen();
    }
    public void repairTouchScreen() {
        phone.repairTouchScreen();
    }
    public void repairSpeaker() {
        phone.repairSpeaker();
    }
}
