package com.fatouhali.docker_compose.product;

import java.util.List;

public interface ProductService {

Product saveProduct(Product product);

List<Product> getAllProduct();
}
