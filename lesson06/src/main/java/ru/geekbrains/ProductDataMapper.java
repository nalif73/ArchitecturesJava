package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class ProductDataMapper {

    private List<Product> products = new ArrayList<>();
    private ProductIdentityMap productMap = new ProductIdentityMap();

    public Product find(Long productId) {
        Product product = productMap.getProduct(productId);
        if (product == null) {
            for (final Product productFromDB : this.getProducts()) {
                if (productFromDB.getProductId() == productId) {
                    productMap.addProduct(product);
                    return product;
                }
            }
        }
        return null;
    }

    public void update(Product productToBeUpdated)  {

        Product product = productMap.getProduct(productToBeUpdated.getProductId());

        if (product != null) {
            productMap.removeProduct(productToBeUpdated.getProductId());
        }
        if (this.getProducts().contains(productToBeUpdated)) {
            final int index = this.getProducts().indexOf(productToBeUpdated);
            this.getProducts().set(index, productToBeUpdated);
            productMap.addProduct(productToBeUpdated);
        } else {
            throw new RuntimeException();
        }
    }


    public void insert(Product productToBeInserted)  {

        Product product = productMap.getProduct(productToBeInserted.getProductId());

        if (product == null && !this.getProducts().contains(productToBeInserted)) {
            this.getProducts().add(productToBeInserted);
            productMap.addProduct(productToBeInserted);
        } else {
            throw new RuntimeException();
        }
    }


    public void delete(Product productToBeDeleted)  {

        Product product = productMap.getProduct(productToBeDeleted.getProductId());

        if (product != null) {
            productMap.removeProduct(productToBeDeleted.getProductId());
        }

        if (this.getProducts().contains(productToBeDeleted)) {
            this.getProducts().remove(productToBeDeleted);
        } else {
            throw new RuntimeException();
        }
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
