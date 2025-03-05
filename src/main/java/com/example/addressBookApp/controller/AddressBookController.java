package com.example.addressBookApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @PostMapping("/add")
    public ResponseEntity<String> addAddress() {
        return ResponseEntity.ok("Address added successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAllAddresses() {
        return ResponseEntity.ok("Returning all addresses");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getAddressById(@PathVariable Long id) {
        return ResponseEntity.ok("Returning address with ID: " + id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAddress(@PathVariable Long id) {
        return ResponseEntity.ok("Address with ID " + id + " updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long id) {
        return ResponseEntity.ok("Address with ID " + id + " deleted successfully");
    }
}