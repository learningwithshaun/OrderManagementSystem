package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("INSTORE")
public class InstoreOrder extends Order{
    private double immediatePayment;
    private String cashierName;

    public InstoreOrder(){

    }

    public InstoreOrder(Builder builder){
        super(builder);
        this.immediatePayment = builder.immediatePayment;
        this.cashierName = builder.cashierName;
    }

    public double getImmediatePayment() {
        return immediatePayment;
    }

    public String getCashierName() {
        return cashierName;
    }

    @Override
    public String toString() {
        return "InstoreOrder{" +
                "immediatePayment=" + immediatePayment +
                ", cashierName='" + cashierName + '\'' +
                '}';
    }

    public static class Builder extends Order.Builder{
        private double immediatePayment;
        private String cashierName;

        public Builder setImmediatePayment(double immediatePayment){
            this.immediatePayment = immediatePayment;
            return this;
        }

        public Builder setCashierName(String cashierName){
            this.cashierName = cashierName;
            return this;
        }

        @Override
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

        public InstoreOrder build(){
            return new InstoreOrder(this);
        }
    }
}
