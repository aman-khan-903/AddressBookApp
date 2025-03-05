package com.example.addressBookApp.sevice;


import java.util.ArrayList;
import java.util.List;

public class AddressBookService {
    private final List<String> addressBook = new ArrayList<>();

    public String addAddress(String name){
        addressBook.add(name);
        return "Address added :" + name;
    }
    public String getAllAddress(){
        return "All Addresses" + addressBook.toString();
    }
    public String getAddressById(int id) {
        if (id >= 0 && id < addressBook.size()) {
            return "Address at ID " + id + ": " + addressBook.get(id);
        } else {
            return "Address not found for ID: " + id;
        }
    }

    public String updateAddress(int id, String newName) {
        if (id >= 0 && id < addressBook.size()) {
            addressBook.set(id, newName);
            return "Updated address at ID " + id + " to: " + newName;
        } else {
            return "Address not found for update at ID: " + id;
        }
    }

    public String deleteAddress(int id) {
        if (id >= 0 && id < addressBook.size()) {
            String removed = addressBook.remove(id);
            return "Deleted address: " + removed;
        } else {
            return "Address not found for deletion at ID: " + id;
        }
    }
}