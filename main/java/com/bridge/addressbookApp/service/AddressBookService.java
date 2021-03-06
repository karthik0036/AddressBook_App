package com.bridge.addressbookApp.service;

import com.bridge.addressbookApp.dto.ContactDTO;
import com.bridge.addressbookApp.exception.AddressBookException;
import com.bridge.addressbookApp.model.Contact;
import com.bridge.addressbookApp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Override
    public List<Contact> getContact() {
        return addressBookRepository.findAll();
    }

    @Override
    public Contact getContactById(int contactId) {
        return addressBookRepository.findById(contactId)
                .orElseThrow(() -> new AddressBookException("Contact with id " + contactId + " does not exist..!"));
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(contactDTO);
        return addressBookRepository.save(contact);
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = this.getContactById(contactId);
        contact.updateContact(contactDTO);
        return addressBookRepository.save(contact);
    }

    @Override
    public void deleteContact(int contactId) {
        Contact contact = this.getContactById(contactId);
        addressBookRepository.delete(contact);
    }

    @Override
    public String deleteAllAddressBookData() {
        addressBookRepository.deleteAll();
        return "Successfully deleted all the Contacts from AddressBook";
    }

    @Override
    public List<Contact> sortByCity() {
        return addressBookRepository.sortByCity();
    }
    @Override
    public List<Contact> sortByState() {
        return addressBookRepository.sortByState();
    }

}
