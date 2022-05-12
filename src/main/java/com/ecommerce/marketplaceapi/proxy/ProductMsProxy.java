package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.dto.product.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "product-marketplace-in", url = "http://localhost:6364/product")
public interface ProductMsProxy {

    @PostMapping
    void receiveProduct(ProductDto productDTO);

    @PutMapping("/price")
    void updatePrice(ProductPriceUpdateDto productPriceUpdateDTO);

    @PutMapping("/stock")
    void updateStock(ProductStockUpdateDto productStockUpdateDTO);

    @PutMapping("/delivery-data")
    void updateDeliveryData(ProductDeliveryDataUpdateDto productDeliveryDataUpdateDTO);

    @PutMapping("/status")
    void updateStatus(ProductStatusUpdateDto productStatusUpdateDTO);

}
