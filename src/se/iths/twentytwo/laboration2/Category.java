package se.iths.twentytwo.laboration2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Category {
    private final String categoryName;

    private static final Map<String, Category> categoryList = new HashMap<>();

    private Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public static Category of(String categoryName) {
        return categoryList.computeIfAbsent(categoryName, key -> new Category(key));
    }

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
}
