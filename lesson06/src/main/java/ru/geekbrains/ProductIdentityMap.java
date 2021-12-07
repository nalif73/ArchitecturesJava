package ru.geekbrains;

import java.util.HashMap;
import java.util.Map;


public class ProductIdentityMap {

    private static Map<Long, Product> productMap = new HashMap<>();

    public static void addProduct(Product product) {
        System.out.println("... добавляем продукт в карту соответствия");
        productMap.put(product.getProductId(), product);
    }

    public static Product getProduct(Long key) {
        System.out.println("... ищем продукт в карте соответствия");
        return (Product) productMap.get(key);
    }

    public static Product removeProduct(Long key) {
        System.out.println("... удаляем продукт из карты соответствия");
        Product prod = productMap.get(key);
        productMap.remove(key);
        return prod;
    }
}
