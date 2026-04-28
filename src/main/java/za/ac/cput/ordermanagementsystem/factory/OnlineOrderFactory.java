package za.ac.cput.ordermanagementsystem.factory;

import za.ac.cput.ordermanagementsystem.domain.OnlineOrder;
import za.ac.cput.ordermanagementsystem.util.Helper;

import java.time.LocalDateTime;

public class OnlineOrderFactory {
    public static OnlineOrder createOrder(String orderId, LocalDateTime date, String status, String deliveryAddress, String shippingCode, double digitalPayment){

        if (!Helper.isNullOrEmpty(orderId)){
            throw new IllegalArgumentException("Order ID is required");
        }

        if (!Helper.isValidDateTime(date)){
            throw new IllegalArgumentException("Invalid date");
        }

        if (!Helper.isNullOrEmpty(status)){
            throw new IllegalArgumentException("Status is required");
        }

        if (!Helper.isNullOrEmpty(deliveryAddress)){
            throw new IllegalArgumentException("Delivery address is required");
        }

        if (!Helper.isNullOrEmpty(shippingCode)){
            throw new IllegalArgumentException("Shipping code is required");
        }

        if (!Helper.isValidPayment(digitalPayment)){
            throw new IllegalArgumentException("Invalid payment amount");
        }

        return new OnlineOrder.Builder()
                .setOrderId(orderId)
                .setDate(date)
                .setStatus(status)
                .setDeliveryAddress(deliveryAddress)
                .setShippingCode(shippingCode)
                .setDigitalPayment(digitalPayment)
                .build();
    }
}


