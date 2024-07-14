package dev.rg.productservice.dtos;

import dev.rg.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProductDto {
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
