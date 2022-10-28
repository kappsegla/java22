package se.iths.twentytwo.laboration2;

import java.math.BigDecimal;

public class ProductBuilder {
    private String productName;
    private String eanCode;
    private BigDecimal price;
    private Category category;


    public ProductBuilder() {
    }

    public ProductBuilder setEanCode(String eanCode) {
        this.eanCode = eanCode;
        return this;
    }

    public ProductBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product build() {
        return new AProductBuilder().setProductName(productName).setEanCode(eanCode).setPrice(price).setCategory(category).createProduct();
    }

}
