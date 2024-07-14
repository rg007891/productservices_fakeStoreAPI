package dev.rg.productservice.services;

import dev.rg.productservice.dtos.FakeStoreProductDto;
import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private final RestTemplate restTemplate;

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

    public List<Product> getProductByCategory(String category)
    {
        ResponseEntity<FakeStoreProductDto[]> responseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/category/" + category,
                FakeStoreProductDto[].class
        );

        FakeStoreProductDto[] fakeStoreProductDtos = responseEntity.getBody();

        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos)
        {
            products.add(fakeStoreProductDto.toProduct());
        }

        return products;
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

    public Product updateProduct(Long id, UpdateProductDto updateProductDto)
    {
//        FakeStoreProductDto response = restTemplate.postForObject(
//                "https://fakestoreapi.com/products/" + id,
//                updateProductDto,
//                FakeStoreProductDto.class
//        );
//
//        return response.toProduct();

        HttpEntity<UpdateProductDto> requestEntity = new HttpEntity<>(updateProductDto);
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.exchange(
                "https://fakestoreapi.com/products/" + id,
                HttpMethod.PUT,
                requestEntity,
                FakeStoreProductDto.class
        );
        return responseEntity.getBody().toProduct();
    }

    public Product deleteProduct(Long id)
    {
        HttpEntity<String> requestEntity = new HttpEntity<>(new HttpHeaders());
        ResponseEntity<FakeStoreProductDto> responseEntity = restTemplate.exchange(
                "https://fakestoreapi.com/products/" + id,
                HttpMethod.DELETE,
                requestEntity,
                FakeStoreProductDto.class
        );

        return responseEntity.getBody().toProduct();
    }

}
