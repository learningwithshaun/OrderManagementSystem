package za.ac.cput.ordermanagementsystem.domain;

import jakarta.persistence.Embeddable;

@Embeddable //This is what you use for the value object
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(){

    }

    public Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String firstName){
            this.middleName = middleName;
            return this;
        }

        public Builder setLasttName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
