package dev.rg.productservice.dtos;

import dev.rg.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String category;
}
