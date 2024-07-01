package dev.rg.productservice.controllers;

import dev.rg.productservice.models.Product;
import dev.rg.productservice.services.FakeStoreProductService;
import dev.rg.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
public class ProductController {

    /*This is not an good idea or practice
    ProductService productService = new FakeStoreProductService();*/

//    instead use dependency injection
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public void createProduct(){

    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    // Jackson library: to convert Java obj into JSON and vice-versa
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") Long id){

    }
}
