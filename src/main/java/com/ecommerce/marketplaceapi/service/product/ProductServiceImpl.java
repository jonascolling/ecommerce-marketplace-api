package com.ecommerce.marketplaceapi.service.product;

import com.ecommerce.marketplaceapi.proxy.ProductMsProxy;
import com.marketplace.marketplacecommon.dto.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMsProxy productMsProxy;

    @Override
    public void receiveProduct(ProductDto productDTO) {
        productMsProxy.receiveProduct(productDTO);
    }

    @Override
    public void updatePrice(ProductPriceUpdateDto productPriceUpdateDTO) {
        productMsProxy.updatePrice(productPriceUpdateDTO);
    }

    @Override
    public void updateStock(ProductStockUpdateDto productStockUpdateDTO) {
        productMsProxy.updateStock(productStockUpdateDTO);
    }

    @Override
    public void updateDeliveryData(ProductDeliveryDataUpdateDto productDeliveryDataUpdateDTO) {
        productMsProxy.updateDeliveryData(productDeliveryDataUpdateDTO);
    }

    @Override
    public void updateStatus(ProductStatusUpdateDto productStatusUpdateDTO) {
        productMsProxy.updateStatus(productStatusUpdateDTO);
    }

}
