package com.ecommerce.marketplaceapi.service.order;

import com.ecommerce.marketplaceapi.proxy.OrderMsProxy;
import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentStatusUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMsProxy orderMsProxy;

    @Override
    public void updateConsignmentStatus(ConsignmentStatusUpdateDto consignmentStatusUpdateDto) {
        orderMsProxy.updateConsignmentStatus(consignmentStatusUpdateDto);
    }

    @Override
    public void saveComission(ConsignmentComissionDto consignmentComissionDto) {
        orderMsProxy.saveComission(consignmentComissionDto);
    }
}
