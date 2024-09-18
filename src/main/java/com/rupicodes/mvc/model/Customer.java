package com.rupicodes.mvc.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    @NotNull(message = "First Name is required")
    private  String firstName;

    @NotNull(message = "Last Name is required")
    @Size(min=3, message = "Atleast 3 characters required")
    private String lastName;

    private Customer() {}

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
