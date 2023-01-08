package com.order.ecommerce.util;

import java.math.BigDecimal;
import java.util.List;

import com.order.ecommerce.dto.AddressDto;
import com.order.ecommerce.dto.OrderDto;
import com.order.ecommerce.dto.OrderItemDto;
import com.order.ecommerce.enums.OrderStatus;
import com.order.ecommerce.enums.PaymentMode;
import com.order.ecommerce.enums.ShippingMode;
import lombok.experimental.UtilityClass;

@UtilityClass
public class OrderUtil {

    public static OrderDto createTestOrder() {
        return new OrderDto(
                "1",
                BigDecimal.valueOf(6.0),
                BigDecimal.valueOf(10.0),
                BigDecimal.valueOf(2.0),
                BigDecimal.valueOf(2.0),
                "test",
                ShippingMode.DELIVERY.name(),
                BigDecimal.valueOf(10.0),
                PaymentMode.CREDIT.name(),
                createAddress(),
                createAddress(),
                List.of(
                        new OrderItemDto(101L, "10"),
                        new OrderItemDto(102L, "10")
                ),
                OrderStatus.RECEIVED.name()
        );
    }

    private static AddressDto createAddress() {
        return new AddressDto(
                "3755 M lane",
                "Apt 311",
                "Aurora",
                "IL",
                "60504",
                "test.gmail.com",
                "1234567890"
        );
    }
}
