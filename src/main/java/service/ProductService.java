package service;

import dtos.ProductRespnseDTO;
import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    ProductRespnseDTO getProductById(int id);
    Product createProduct(Product product);
    Product deleteProduct(int id);
    Product updateProduct(int id, Product updatedProduct);
}
