package ru.geekbrains;

public interface OrderBuilder {

    public OrderBuilder installId();

    public OrderBuilder installUser();

    public OrderBuilder installOrderDate();

    public OrderBuilder installExecutionDate();

    public OrderBuilder installItems();

    public OrderBuilder installTotalPrice();

    public OrderBuilder installOrderStatus();

    public Order build();

}
