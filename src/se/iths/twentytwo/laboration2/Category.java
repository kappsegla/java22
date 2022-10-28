package se.iths.twentytwo.laboration2;

import java.util.Objects;

public class Category {
    private final String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return Objects.equals(categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return categoryName != null ? categoryName.hashCode() : 0;
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
