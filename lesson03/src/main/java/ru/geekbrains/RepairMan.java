package ru.geekbrains;

public class RepairMan {

    private OrderBuilder builder;

    public RepairMan(OrderBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Мастер не может работать без заказа");
        }
    }

    public Order buildOrder() {

        return builder.installId()
                .installUser()
                .installOrderDate()
                .installExecutionDate()
                .installItems()
                .installTotalPrice()
                .installOrderStatus()
                .build();
    }

}
