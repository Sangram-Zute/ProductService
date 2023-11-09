package controller;

import dtos.ProductRespnseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("FakeStoreService")
    public ProductService productService;

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/products/1")
    public ResponseEntity getProductFromID(){
        ProductRespnseDTO respnseDTO = productService.getProductById(1);
        return ResponseEntity.ok(respnseDTO);

    }

}
