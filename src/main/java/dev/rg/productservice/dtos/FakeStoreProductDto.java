package dev.rg.productservice.dtos;

import dev.rg.productservice.models.Category;
import dev.rg.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;

    public Product toProduct(){
        Product product = new Product();
        product.setId(this.id);
        product.setTitle(this.title);
        product.setPrice(this.price);
        product.setDescription(this.description);
        product.setImage(this.image);

        Category category = new Category();
        category.setTitle(this.category);
        product.setCategory(category);

        return product;
    }
}
