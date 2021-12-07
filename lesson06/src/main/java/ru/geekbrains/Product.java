package ru.geekbrains;

import java.io.Serializable;
import java.math.BigDecimal;

public final class Product implements Serializable {

    private Long productId;
    private String name;
    private BigDecimal price;

    public Product(final long productId, final String name, final BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(final Object comparingObject) {

        boolean isEqual = false;
        if (this == comparingObject) {
               isEqual = true;
        } else if (comparingObject != null && getClass() == comparingObject.getClass()) {
                final Product inputStudent = (Product) comparingObject;
            if (this.getProductId() == inputStudent.getProductId()) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return (int) this.getProductId();
    }

    @Override
    public String toString() {
        return "[productId=" + productId + ", name=" + name + ", price=" + price + "]";
    }
}
