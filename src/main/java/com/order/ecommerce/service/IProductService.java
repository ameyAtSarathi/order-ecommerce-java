package com.order.ecommerce.service;

import com.order.ecommerce.dto.ProductDto;

import java.util.List;

public interface IProductService {

    ProductDto createProduct(ProductDto productDto);

    ProductDto findProductById(Long productId);

    List<ProductDto> findAllById(List<Long> ids);
}
