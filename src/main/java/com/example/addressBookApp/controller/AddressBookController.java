package com.example.addressBookApp.controller;

import com.example.addressBookApp.DTO.AddressDTO;
import com.example.addressBookApp.sevice.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;
    @PostMapping("/add")
    public ResponseEntity<String> addAddress(@RequestBody AddressDTO addressDTO) {
        return ResponseEntity.ok(service.addAddress(addressDTO));
    }
    @GetMapping("/all")
    public ResponseEntity<String> getAllAddresses() {
        return ResponseEntity.ok("Returning all addresses");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getAddressById(@PathVariable long id) {
        return ResponseEntity.ok("Returning address with ID: " + id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAddress(@PathVariable long id, @RequestBody AddressDTO addressDTO) {
        return ResponseEntity.ok(service.updateAddress(id, addressDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable long id) {
        return ResponseEntity.ok("Address with ID " + id + " deleted successfully");
    }
}