package com.bridge.addressbookApp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.ToString;


@ToString
public class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$",message = "FirstName is invalid")
    @NotEmpty(message = "FirstName cannot be NULL")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$",message = "LastName is invalid")
    @NotEmpty(message = "LastName cannot be NULL")
    public String lastName;
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Email is invalid")
    public String email;
    @NotBlank(message = "Address cannot be  empty")
    public String address;
    @NotEmpty(message = "State cannot be NULL")
    public String state;
    @NotEmpty(message = "City cannot be NULL")
    public String city;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Invalid Zip")
    public String zip;
    @Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$", message = "Invalid Phone number")
    public String phone;



}
