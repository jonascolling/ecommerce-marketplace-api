package com.ecommerce.marketplaceapi.service.order;

import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentStatusUpdateDto;

public interface OrderService {

    void updateConsignmentStatus(ConsignmentStatusUpdateDto consignmentStatusUpdateDto);

    void saveComission(ConsignmentComissionDto consignmentComissionDto);

}
