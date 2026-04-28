package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name= "orders")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Order {
    @Id
    private String orderId;
    private LocalDateTime date;
    private String status;

    public Order() {

    }

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.date = builder.date;
        this.status = builder.status;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }

    public static abstract class Builder{
        private String orderId;
        private LocalDateTime date;
        private String status;

        public Builder setOrderId(String orderId){
            this.orderId = orderId;
            return this;
        }

        public Builder setDate(LocalDateTime date){
            this.date = date;
            return this;
        }

        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public abstract Order build();
    }
}
