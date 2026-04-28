package za.ac.cput.ordermanagementsystem.factory;

import za.ac.cput.ordermanagementsystem.domain.OrderItem;
import za.ac.cput.ordermanagementsystem.util.Helper;

public class OrderItemFactory {
    public static OrderItem createOrderItem(String orderItemId, int quantity, double subTotal){

        if (!Helper.isNullOrEmpty(orderItemId)){
            throw new IllegalArgumentException("OrderItem ID is required");
        }

        if(!Helper.isValidQuantity(quantity)){
            throw new IllegalArgumentException("Invalid quantity");
        }

        if (!Helper.isValidSubTotal(subTotal)){
            throw new IllegalArgumentException("Invalid subtotal");
        }

        return new OrderItem.Builder()
                .setOrderItemId(orderItemId)
                .setQuantity(quantity)
                .setSubTotal(subTotal)
                .build();
    }
}
