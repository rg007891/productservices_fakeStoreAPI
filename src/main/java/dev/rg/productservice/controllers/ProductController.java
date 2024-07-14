package dev.rg.productservice.controllers;

import dev.rg.productservice.dtos.ErrorDto;
import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Product;
import dev.rg.productservice.services.ProductService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    public void createProduct(){

    }

    @GetMapping()
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category)
    {
        return productService.getProductByCategory(category);
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id)
    {
        return productService.getSingleProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody UpdateProductDto updateProduct)
    {
        return productService.updateProduct(id, updateProduct);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }

//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<ErrorDto> errorHandler(){
//        ErrorDto errorDto = new ErrorDto();
//        errorDto.setMessage("Something went wrong. Please try later.");
//
//        return new ResponseEntity<>(errorDto, HttpStatusCode.valueOf(404));
//    }
}
