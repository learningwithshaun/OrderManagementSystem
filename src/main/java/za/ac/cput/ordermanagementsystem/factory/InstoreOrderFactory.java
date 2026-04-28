package za.ac.cput.ordermanagementsystem.factory;

import za.ac.cput.ordermanagementsystem.domain.InstoreOrder;
import za.ac.cput.ordermanagementsystem.util.Helper;

import java.time.LocalDateTime;

public class InstoreOrderFactory {
    public static InstoreOrder createInstoreOrder(String orderId, LocalDateTime date, String status,double immdediatePayment, String cashierName){

        if (!Helper.isNullOrEmpty(orderId)){
            throw new IllegalArgumentException("Order ID is required");
        }

        if (!Helper.isValidDateTime(date)){
            throw new IllegalArgumentException("Invalid date");
        }

        if (!Helper.isNullOrEmpty(status)){
            throw new IllegalArgumentException("Status is required");
        }

        if (!Helper.isValidPayment(immdediatePayment)){
            throw new IllegalArgumentException("Invalid payment amount");
        }

        if (!Helper.isNullOrEmpty(cashierName)){
            throw new IllegalArgumentException("Cashier name is required");
        }

        return new InstoreOrder.Builder()
                .setOrderId(orderId)
                .setDate(date)
                .setStatus(status)
                .setImmediatePayment(immdediatePayment)
                .setCashierName(cashierName)
                .build();

    }
}
