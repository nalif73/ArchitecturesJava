package ru.geekbrains;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private long id;
    private User user;
    private Date orderDate;
    private Date executionDate;
    private List<OrderItem> items;
    private BigDecimal totalPrice;
    private boolean orderStatus;

//    public Order {
//        super();
//    }

    public Order(long id, User user, Date orderDate, Date executionDate, List<OrderItem> items, BigDecimal totalPrice, boolean orderStatus) {
        this.id = id;
        this.user = user;
        this.orderDate = orderDate;
        this.executionDate = executionDate;
        this.items = items;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", executionDate=" + executionDate +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
