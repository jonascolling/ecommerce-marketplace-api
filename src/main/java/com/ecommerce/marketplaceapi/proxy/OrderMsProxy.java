package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "marketplace-in", url = "http://localhost:6364/order")
public interface OrderMsProxy {

    @PostMapping("/status")
    void updateConsignmentStatus(ConsignmentDto consignmentDto);

    @PostMapping("/comission")
    void saveComission(ConsignmentComissionDto consignmentComissionDto);

}
