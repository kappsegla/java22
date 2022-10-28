package se.iths.twentytwo.laboration2;

import java.math.BigDecimal;

public class AProductBuilder {
    private String productName;
    private String eanCode;
    private BigDecimal price;
    private Category category;

    public AProductBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public AProductBuilder setEanCode(String eanCode) {
        this.eanCode = eanCode;
        return this;
    }

    public AProductBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public AProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product createProduct() {
        return new Product(productName, eanCode, price, category);
    }
}