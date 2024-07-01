package dev.rg.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private Long id;
    private String title;
    private String desc;
    private Double price;
    private Category category;

//    public void setTitle(String title){
//        this.title = title;
//    }
}
