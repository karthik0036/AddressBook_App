package com.bridge.addressbookApp.model;

import com.bridge.addressbookApp.dto.ContactDTO;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "addressbook")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact_Id")
    private int contactId;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "State")
    private String state;

    @Column(name = "City")
    private String city;

    @Column(name = "Zip")
    private String zip;

    @Column(name = "Phone")
    private String phone;


    public Contact(ContactDTO contactDTO) {
        this.updateContact(contactDTO);
    }

    public Contact() {

    }

    public void updateContact(ContactDTO contactDTO) {
        this.contactId = contactId;
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


