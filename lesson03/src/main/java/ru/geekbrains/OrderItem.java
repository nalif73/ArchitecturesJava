package ru.geekbrains;

public class OrderItem {
    private long id;
    private Repair item;
    private int quantity;
    private boolean orderItemStatus;

    public OrderItem(long id, Repair item, int quantity, boolean orderItemStatus) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.orderItemStatus = orderItemStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Repair getItem() {
        return item;
    }

    public void setItem(Repair item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(boolean orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }
}
