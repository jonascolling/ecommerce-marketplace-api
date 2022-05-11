package com.ecommerce.marketplaceapi.service.order;

import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentDto;

public interface OrderService {

    void updateConsignmentStatus(ConsignmentDto consignmentDto);

    void saveComission(ConsignmentComissionDto consignmentComissionDto);

}
