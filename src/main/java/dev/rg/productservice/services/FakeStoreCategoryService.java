package dev.rg.productservice.services;

import dev.rg.productservice.models.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreCategoryService implements CategoryService{

    private final RestTemplate restTemplate;

    public FakeStoreCategoryService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Category> getAllCategories(){
        List<String> response = restTemplate.getForObject(
                "https://fakestoreapi.com/products/categories",
                List.class
        );

        List<Category> categories = new ArrayList<>();

        for(String title: response){
            Category cat = new Category();
            cat.setTitle(title);

            categories.add(cat);
        }
        return categories;
    }
}
