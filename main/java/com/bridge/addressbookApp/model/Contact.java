package com.bridge.addressbookApp.model;

import com.bridge.addressbookApp.dto.ContactDTO;
import lombok.Data;

@Data
public class Contact {

    private int contactId;
    public String firstName;
    public String lastName;
    public String email;
    public String address;
    public String state;
    public String city;
    public String zip;
    public String phone;

    public Contact(int contactId, ContactDTO contactDTO) {
        this.contactId = contactId;
        this.updateContact(contactDTO);
    }

    private void updateContact(ContactDTO contactDTO) {
        this.firstName = contactDTO.firstName;
        this.lastName = contactDTO.lastName;
        this.email = contactDTO.email;
        this.address = contactDTO.address;
        this.city = contactDTO.city;
        this.state = contactDTO.state;
        this.zip = contactDTO.zip;
        this.phone = contactDTO.phone;


    }
}


