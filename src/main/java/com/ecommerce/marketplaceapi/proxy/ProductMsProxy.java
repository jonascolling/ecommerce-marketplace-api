package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.product.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "marketplace-in", url = "http://localhost:6364/product")
public interface ProductMsProxy {

    @PostMapping
    void receiveProduct(ProductDTO productDTO);

    @PutMapping("/price")
    void updatePrice(ProductPriceUpdateDTO productPriceUpdateDTO);

    @PutMapping("/stock")
    void updateStock(ProductStockUpdateDTO productStockUpdateDTO);

    @PutMapping("/delivery-data")
    void updateDeliveryData(ProductDeliveryDataUpdateDTO productDeliveryDataUpdateDTO);

    @PutMapping("/status")
    void updateStatus(ProductStatusUpdateDTO productStatusUpdateDTO);

}
