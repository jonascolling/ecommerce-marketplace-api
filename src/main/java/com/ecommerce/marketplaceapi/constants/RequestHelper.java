package com.ecommerce.marketplaceapi.constants;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Optional;

@Component
public class RequestHelper {

    static final String REQUEST_ORIGIN = "X-Request-Origin";

    public String getUriOrigin(WebRequest request) {
        return Optional
                .ofNullable(request.getHeader(REQUEST_ORIGIN))
                .map(r -> "uri=" + r)
                .orElse(request.getDescription(false));
    }


}
