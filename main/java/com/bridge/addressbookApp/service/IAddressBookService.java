package com.bridge.addressbookApp.service;

import com.bridge.addressbookApp.dto.ContactDTO;
import com.bridge.addressbookApp.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);

    String deleteAllAddressBookData();

    List<Contact> sortByCity();

    List<Contact> sortByState();
}