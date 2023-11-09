package service;

import dtos.ProductRespnseDTO;
import model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("FakeStoreService")
public class FakeStoreProductServiceImpl implements ProductService{

    ProductService productService;
    RestTemplateBuilder restTemplateBuilder;
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public ProductRespnseDTO getProductById(int id) {
        String getOneProduct = "https://fakestoreapi.com/products/" + id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductRespnseDTO> response =
                restTemplate.getForEntity(getOneProduct, ProductRespnseDTO.class);
        System.out.println(response.getBody());
        return response.getBody();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        return null;
    }
}
