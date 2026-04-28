package za.ac.cput.ordermanagementsystem.factory;

import za.ac.cput.ordermanagementsystem.domain.Product;
import za.ac.cput.ordermanagementsystem.util.Helper;

public class ProductFactory {
    public static Product createProduct(String productId, String productName, double price, int stockQuantity){

        if (!Helper.isNullOrEmpty(productId)){
            throw new IllegalArgumentException("Product ID is required");
        }

        if (!Helper.isNullOrEmpty(productName)){
            throw new IllegalArgumentException("Product name is required");
        }

        if (!Helper.isValidPrice(price)){
            throw new IllegalArgumentException("Invalid price");
        }

        if(!Helper.isValidQuantity(stockQuantity)){
            throw new IllegalArgumentException("Invalid stock quantity");
        }

        return new Product.Builder()
                .setProductId(productId)
                .setProductName(productName)
                .setPrice(price)
                .setStockQuantity(stockQuantity)
                .build();

    }
}
