package com.fatouhali.docker_compose.web;

import com.fatouhali.docker_compose.product.Product;
import com.fatouhali.docker_compose.product.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    private  final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(path = "")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping(path = "")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
}
