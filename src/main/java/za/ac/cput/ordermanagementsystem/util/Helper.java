package za.ac.cput.ordermanagementsystem.util;

import za.ac.cput.ordermanagementsystem.domain.Name;

public class Helper {

    public static boolean isNullOrEmpty(String str){
        return str == null || str.trim().isEmpty();
    }

    public static boolean isValidDateTime(java.time.LocalDateTime dateTime) {
        return dateTime != null && !dateTime.isBefore(java.time.LocalDateTime.now());
    }

    public static boolean isValidQuantity(int quantity){
        return quantity <= 0;
    }

    public static boolean isValidSubTotal(double subTotal){
        return subTotal <= 0;
    }

    public static boolean isValidPrice(double price){
        return price <= 0;
    }

    public static boolean isValidPayment(double paymement){
        return paymement <= 0;
    }

    public static boolean isEmptyValueObject(Name name){
        return name ==  null;
    }
}
