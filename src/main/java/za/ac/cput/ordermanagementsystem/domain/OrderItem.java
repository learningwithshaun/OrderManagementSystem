package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    private String orderItemId;
    private int quantity;
    private double subTotal;

    public OrderItem(){

    }

    public OrderItem(Builder builder){
        this.orderItemId = builder.orderItemId;
        this.quantity = builder.quantity;
        this.subTotal = builder.subTotal;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", quantity=" + quantity +
                ", subTotal=" + subTotal +
                '}';
    }

    public static class Builder{
        private String orderItemId;
        private int quantity;
        private double subTotal;

        public Builder setOrderItemId(String orderItemId){
            this.orderItemId = orderItemId;
            return this;
        }

        public Builder setQuantity(int quantity){
            this.quantity = quantity;
            return this;
        }

        public Builder setSubTotal(double subTotal){
            this.subTotal = subTotal;
            return this;
        }

        public OrderItem build(){
            return new OrderItem(this);
        }
    }
}
