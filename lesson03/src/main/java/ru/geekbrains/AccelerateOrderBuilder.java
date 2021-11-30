package ru.geekbrains;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AccelerateOrderBuilder implements OrderBuilder {

    private long id;
    private User user;
    private Date orderDate;
    private Date executionDate;
    private List<OrderItem> items;
    private BigDecimal totalPrice;
    private boolean orderStatus;


    @Override
    public OrderBuilder installId() {
        System.out.println("Ускоренный заказ на ремонт. Установка id");
        this.id = 1;
        return this;
    }

    @Override
    public OrderBuilder installUser() {
        System.out.println("Ускоренный заказ на ремонт. Установка user");
        this.user = new User(1, "Arkhangelsk", "22-33-22", true);
        return this;
    }

    @Override
    public OrderBuilder installOrderDate() {
        System.out.println("Ускоренный заказ на ремонт. Установка orderDate");
        this.orderDate = new Date();
        return this;
    }

    @Override
    public OrderBuilder installExecutionDate() {
        System.out.println("Ускоренный заказ на ремонт. Установка executionDate");
        this.executionDate = new Date();
        return this;
    }

    @Override
    public OrderBuilder installItems() {
        System.out.println("Ускоренный заказ на ремонт. Установка Items");
        this.items = new ArrayList(Arrays.asList(new OrderItem(1, new Repair(1, "Замена стекла", BigDecimal.valueOf(200)), 1, true)));
        //add(new OrderItem(1,new Repair(1, "Замена стекла", BigDecimal.valueOf(200)), 1, true));
        return this;
    }

    @Override
    public OrderBuilder installTotalPrice() {
        System.out.println("Ускоренный заказ на ремонт. Установка TotalPrice");
        this.totalPrice = BigDecimal.valueOf(2000);
        return this;
    }

    @Override
    public OrderBuilder installOrderStatus() {
        System.out.println("Ускоренный заказ на ремонт. Установка OrderStatus");
        this.orderStatus = true;
        return this;
    }

    @Override
    public Order build() {
        Order order = new Order(id, user, orderDate, executionDate, items, totalPrice, orderStatus);
        return order;
    }
}
