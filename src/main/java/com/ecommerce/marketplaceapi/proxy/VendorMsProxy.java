package com.ecommerce.marketplaceapi.proxy;

import com.marketplace.marketplacecommon.dto.vendor.VendorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "vendor-marketplace-in", url = "http://localhost:6364/vendor")
public interface VendorMsProxy {

    @PostMapping
    void receiveVendor(VendorDto vendorDto);

}
