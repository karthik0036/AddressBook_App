package com.bridge.addressbookApp.controller;

import com.bridge.addressbookApp.dto.ContactDTO;
import com.bridge.addressbookApp.dto.ResponseDTO;
import com.bridge.addressbookApp.model.Contact;
import com.bridge.addressbookApp.service.AddressBookService;
import com.bridge.addressbookApp.service.IAddressBookService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
@Slf4j
public class AddressBookController {

    @Autowired
    private IAddressBookService addressbookservice;

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getContactData() {
        List<Contact> contactList = addressbookservice.getContact();
        ResponseDTO response = new ResponseDTO("Get call success", contactList);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactDataById(@PathVariable("contactId") int contactId) {
        Contact contact = addressbookservice.getContactById(contactId);
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData( @Valid @RequestBody ContactDTO contactDTO) {
        Contact contact = addressbookservice.createContact(contactDTO);
        log.debug("Address Book DTO: " + contactDTO.toString());
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
                                                         @Valid  @RequestBody ContactDTO contactDTO) {
        Contact contact = addressbookservice.updateContact(contactId, contactDTO);
        log.debug("AddressBook Contact After Update " + contact.toString());
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        addressbookservice.deleteContact(contactId);
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }


}
