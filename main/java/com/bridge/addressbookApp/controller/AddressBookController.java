package com.bridge.addressbookApp.controller;

import com.bridge.addressbookApp.dto.ContactDTO;
import com.bridge.addressbookApp.dto.ResponseDTO;
import com.bridge.addressbookApp.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getContactData() {

        Contact contact = new Contact(1,
                new ContactDTO("Ned", "Stark", "West of cord", "Karnataka", "Bengaluru", "560064", "9999999999"));
        ResponseDTO response = new ResponseDTO("Get call success", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Rob", "Stark", "Jalahalli", "Karnataka", "Chikkaballapura", "561890", "8888888888"));
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
                                                         @RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }


}
