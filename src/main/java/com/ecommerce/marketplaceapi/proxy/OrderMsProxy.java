package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentStatusUpdateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "order-marketplace-in", url = "http://localhost:6364/order")
public interface OrderMsProxy {

    @PostMapping("/status")
    void updateConsignmentStatus(ConsignmentStatusUpdateDto consignmentStatusUpdateDto);

    @PostMapping("/comission")
    void saveComission(ConsignmentComissionDto consignmentComissionDto);

}
