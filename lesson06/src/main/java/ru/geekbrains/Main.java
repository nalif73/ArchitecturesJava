package ru.geekbrains;

import java.math.BigDecimal;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        final ProductDataMapper mapper = new ProductDataMapper();
        Product product = new Product(1, "Сыр", BigDecimal.valueOf(456.31));
        mapper.insert(product);
        System.out.println("Продукт: " + product + ", добавлен");

        final Product productToBeFound = mapper.find(product.getProductId());
        System.out.println("Продукт: " + productToBeFound + ", найден");

        product = new Product(product.getProductId(), "Чай", BigDecimal.valueOf(400.50));
        mapper.update(product);
        System.out.println("Продукт: " + product + ", обновлен");

        mapper.delete(product);
        System.out.println("Продукт: " + product + ", удален");

    }
}

