package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("ONLINE")
public class OnlineOrder extends Order {
    private String deliveryAddress;
    private String shippingCode;
    private double digitalPayment;

    public OnlineOrder() {

    }

    public OnlineOrder(Builder builder) {
        super(builder);
        this.deliveryAddress = builder.deliveryAddress;
        this.shippingCode = builder.shippingCode;
        this.digitalPayment = builder.digitalPayment;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public double getDigitalPayment() {
        return digitalPayment;
    }

    @Override
    public String toString() {
        return "OnlineOrder{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", shippingCode='" + shippingCode + '\'' +
                ", digitalPayment=" + digitalPayment +
                '}';
    }

    public static class Builder extends Order.Builder {
        private String deliveryAddress;
        private String shippingCode;
        private double digitalPayment;

        public Builder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder setShippingCode(String shippingCode) {
            this.shippingCode = shippingCode;
            return this;
        }

        public Builder setDigitalPayment(double digitalPayment) {
            this.digitalPayment = digitalPayment;
            return this;
        }

        @Override
        //    My mistake was I kept saying Order.Builder hence it was giving me the error
        public Builder setStatus(String status) {
            super.setStatus(status);
            return this;
        }

        @Override
        public Builder setDate(LocalDateTime date) {
            super.setDate(date);
            return this;
        }

        @Override
        public Builder setOrderId(String orderId) {
            super.setOrderId(orderId);
            return this;
        }

        @Override
        public OnlineOrder build() {
            return new OnlineOrder(this);
        }
    }
}