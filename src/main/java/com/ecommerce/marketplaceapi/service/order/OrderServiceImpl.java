package com.ecommerce.marketplaceapi.service.order;

import com.ecommerce.marketplaceapi.proxy.OrderMsProxy;
import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMsProxy orderMsProxy;

    @Override
    public void updateConsignmentStatus(ConsignmentDto consignmentDto) {
        orderMsProxy.updateConsignmentStatus(consignmentDto);
    }

    @Override
    public void saveComission(ConsignmentComissionDto consignmentComissionDto) {
        orderMsProxy.saveComission(consignmentComissionDto);
    }
}
