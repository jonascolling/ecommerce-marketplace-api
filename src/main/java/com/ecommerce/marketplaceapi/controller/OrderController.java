package com.ecommerce.marketplaceapi.controller;

import com.ecommerce.marketplaceapi.service.order.OrderService;
import com.marketplace.marketplacecommon.dto.order.ConsignmentComissionDto;
import com.marketplace.marketplacecommon.dto.order.ConsignmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public void updateConsignmentStatus(@RequestBody ConsignmentDto consignmentDto) {
        orderService.updateConsignmentStatus(consignmentDto);
    }

    @PostMapping("/comission")
    @ResponseStatus(HttpStatus.OK)
    public void saveComission(@RequestBody ConsignmentComissionDto consignmentComissionDto) {
        orderService.saveComission(consignmentComissionDto);
    }


}
