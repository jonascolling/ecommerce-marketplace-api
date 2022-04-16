package com.ecommerce.apimarketplace.controller.service.product;

import com.ecommerce.apimarketplace.controller.proxy.ProductMsProxy;
import com.marketplace.marketplacecommon.product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMsProxy productMsProxy;

    @Override
    public void receiveProduct(ProductDTO productDTO) {
        productMsProxy.receiveProduct(productDTO);
    }

}
