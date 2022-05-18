package com.ecommerce.marketplaceapi.service.vendor.product;

import com.ecommerce.marketplaceapi.proxy.VendorMsProxy;
import com.marketplace.marketplacecommon.dto.vendor.VendorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorMsProxy vendorMsProxy;

    @Override
    public void receiveVendor(VendorDto vendorDto) {
        vendorMsProxy.receiveVendor(vendorDto);
    }

}
