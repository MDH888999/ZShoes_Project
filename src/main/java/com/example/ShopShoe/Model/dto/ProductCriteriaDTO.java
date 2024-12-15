package com.example.ShopShoe.Model.dto;

import java.util.List;
import java.util.Optional;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class ProductCriteriaDTO {
    private Optional<String> page;
    private Optional<List<String>> brandNames;
    private Optional<List<String>> category;
    private Optional<List<String>> price;
    private Optional<String> sort;
}
