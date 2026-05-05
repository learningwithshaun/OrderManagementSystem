package za.ac.cput.ordermanagementsystem.factory;

import za.ac.cput.ordermanagementsystem.domain.Customer;
import za.ac.cput.ordermanagementsystem.domain.Name;
import za.ac.cput.ordermanagementsystem.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer(String customerId, Name name, String email, String mobileNumber){

        if(Helper.isNullOrEmpty(customerId)){
            throw new IllegalArgumentException("Customer ID is required.");
        }

        if(Helper.isEmptyValueObject(name)){
            throw new IllegalArgumentException("Name is required.");
        }

        if (!Helper.isValidEmail(email)){ // need apache commons.validator (actually you don't need it)
            throw new IllegalArgumentException("Invalid email");
        }

        return new Customer.Builder()
                .setCustomerId(customerId)
                .setName(name)
                .setEmail(email)
                .setMobileId(mobileNumber)
                .build();
    }
}
