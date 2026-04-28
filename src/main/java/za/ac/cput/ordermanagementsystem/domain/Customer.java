package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private String customerId;
    @Embedded
    private Name name;
    private String email;
    private String mobileNumber;

    public Customer(){

    }
    public Customer(Builder builder){
        this.customerId = builder.customerId;
        this.name = builder.name;
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name=" + name +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String customerId;
        private Name name;
        private String email;
        private String mobileNumber;

        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }

        public Builder setName(Name name){
            this.name = name;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setMobileId(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
