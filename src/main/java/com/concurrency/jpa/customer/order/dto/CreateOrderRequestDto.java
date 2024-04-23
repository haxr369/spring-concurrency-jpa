package com.concurrency.jpa.customer.order.dto;

import com.concurrency.jpa.customer.order.Order;
import com.concurrency.jpa.customer.order.enums.Actors;
import com.concurrency.jpa.customer.order.enums.PaymentMethods;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderRequestDto {

    @JsonProperty("core_products")
    private Map<Long, Long> coreProducts = new HashMap<>();
    @JsonProperty("client_type")
    private Actors clientType;
    @JsonProperty("payment_method")
    private PaymentMethods paymentMethod;

    public Order toEntity(){
        return Order.builder()
                .actor(clientType)
                .paymentMethod(paymentMethod)
                .totalPrice((long) 0)
                .actualProducts(new ArrayList<>())
                .build();
    }
}
