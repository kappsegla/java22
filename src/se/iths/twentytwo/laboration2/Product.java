package se.iths.twentytwo.laboration2;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private final String productName;
    private final String eanCode;
    private BigDecimal price;
    private final Category category;

    public Product(String productName, String eanCode, BigDecimal price, Category category) {
        this.productName = productName;
        this.eanCode = Objects.requireNonNull(eanCode, "EanCode mustn't be null");
        this.price = price;
        this.category = category;

    }

    public String getProductName() {
        return productName;
    }

    public String getEanCode() {
        return eanCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return eanCode.equals(product.eanCode);
    }

    @Override
    public int hashCode() {
        return eanCode.hashCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", eanCode='" + eanCode + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
