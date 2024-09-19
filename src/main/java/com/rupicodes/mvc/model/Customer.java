package com.rupicodes.mvc.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "First Name is required")
    @Size(min=3, message = "Atleast 3 characters required")
    private  String firstName;

    @NotNull(message = "Last Name is required")
    @Size(min=3, message = "Atleast 3 characters required")
    private String lastName;

    @Min(value=0, message="Value must be greater than or equal to zero")
    @Max(value=10, message="Value must be less than or equal to 10")
    private int freePass;

    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(int freePass) {
        this.freePass = freePass;
    }

    public Customer() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
