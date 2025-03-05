package com.example.addressBookApp.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressDTO {
    private String name;
    private String phone;
    private String email;
}