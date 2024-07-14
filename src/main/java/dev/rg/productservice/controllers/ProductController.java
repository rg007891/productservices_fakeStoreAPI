package dev.rg.productservice.controllers;

import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Product;
import dev.rg.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    public void createProduct(){

    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id)
    {
        return productService.getSingleProduct(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody UpdateProductDto updateProduct)
    {
        return productService.updateProduct(id, updateProduct);
    }

    public void deleteProduct(){

    }
}
