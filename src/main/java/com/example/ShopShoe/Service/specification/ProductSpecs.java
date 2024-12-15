package com.example.ShopShoe.Service.specification;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.example.ShopShoe.Model.Product;
import com.example.ShopShoe.Model.Product_;

public class ProductSpecs {
    public static Specification<Product> nameLike(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Product_.NAME), "%" + name + "%");
    }

    // case 1
    public static Specification<Product> minPrice(double price) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.ge(root.get(Product_.PRICE), price);
    }

    // case 2
    public static Specification<Product> maxPrice(double price) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.le(root.get(Product_.PRICE), price);
    }

    // case3
    public static Specification<Product> matchBrand(String brand) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(Product_.BRAND), brand);
    }

    // case4
    public static Specification<Product> matchListBrand(List<String> brand) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.in(root.get(Product_.BRAND)).value(brand);
    }

    // case4
    public static Specification<Product> matchListTarget(List<String> Category) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.in(root.get(Product_.CATEGORY)).value(Category);
    }

    // case5
    public static Specification<Product> matchPrice(double min, double max) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.and(
                criteriaBuilder.gt(root.get(Product_.PRICE), min),
                criteriaBuilder.le(root.get(Product_.PRICE), max));
    }

    // case6
    public static Specification<Product> matchMultiplePrice(double min, double max) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.between(
                root.get(Product_.PRICE), min, max);
    }

}
