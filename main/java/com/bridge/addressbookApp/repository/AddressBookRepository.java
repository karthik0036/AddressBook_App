package com.bridge.addressbookApp.repository;

import com.bridge.addressbookApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {
}