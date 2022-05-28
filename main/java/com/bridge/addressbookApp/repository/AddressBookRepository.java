package com.bridge.addressbookApp.repository;

import com.bridge.addressbookApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {

    @Query(value = "select * from addressbook order by city;", nativeQuery = true)
    List<Contact> sortByCity();

    @Query(value = "select * from addressbook order by state;", nativeQuery = true)
    List<Contact> sortByState();
}
