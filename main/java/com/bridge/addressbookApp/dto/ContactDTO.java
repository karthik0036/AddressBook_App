package com.bridge.addressbookApp.dto;

import jakarta.validation.constraints.Pattern;

public class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$",message = "FirstName is invalid")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$",message = "LastName is invalid")
    public String lastName;
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Email is invalid")
    public String email;
    public String address;
    public String state;
    public String city;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Invalid Zip")
    public String zip;
    @Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$", message = "Invalid Phone number")
    public String phone;

    public ContactDTO(String firstName, String lastName,String email, String address, String state, String city, String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "ContactDTO [First Name =" + firstName + ", Last Name =" + lastName + ", Email =" + email + ", Address =" + address
                + ", State =" + state + ", City =" + city + ", Zip =" + zip + ", Phone =" + phone + "]";
    }
}
