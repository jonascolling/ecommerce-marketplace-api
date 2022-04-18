package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.product.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "marketplace-in", url = "http://localhost:6364")
public interface ProductMsProxy {

    @PostMapping("/product")
    void receiveProduct(ProductDTO productDTO);

}
