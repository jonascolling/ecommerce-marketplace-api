package com.ecommerce.marketplaceapi.service.product;

import com.ecommerce.marketplaceapi.proxy.ProductMsProxy;
import com.marketplace.marketplacecommon.product.dto.*;
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

    @Override
    public void updatePrice(ProductPriceUpdateDTO productPriceUpdateDTO) {
        productMsProxy.updatePrice(productPriceUpdateDTO);
    }

    @Override
    public void updateStock(ProductStockUpdateDTO productStockUpdateDTO) {
        productMsProxy.updateStock(productStockUpdateDTO);
    }

    @Override
    public void updateDeliveryData(ProductDeliveryDataUpdateDTO productDeliveryDataUpdateDTO) {
        productMsProxy.updateDeliveryData(productDeliveryDataUpdateDTO);
    }

    @Override
    public void updateStatus(ProductStatusUpdateDTO productStatusUpdateDTO) {
        productMsProxy.updateStatus(productStatusUpdateDTO);
    }

}
