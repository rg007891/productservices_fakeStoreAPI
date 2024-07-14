package dev.rg.productservice.services;

import dev.rg.productservice.dtos.FakeStoreProductDto;
import dev.rg.productservice.models.Category;
import dev.rg.productservice.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product getSingleProduct(Long id){
        String url = "https://fakestoreapi.com/products/" + id;
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.getForEntity(
                url,
                FakeStoreProductDto.class
        );

        return responseEntity.getBody().toProduct();
    }

    public List<Product> getAllProducts(){
        String url = "https://fakestoreapi.com/products";
        FakeStoreProductDto[] response = restTemplate.getForObject(
                url,
                FakeStoreProductDto[].class
        );

        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: response){
            products.add(fakeStoreProductDto.toProduct());
        }
        return products;
    }

}
