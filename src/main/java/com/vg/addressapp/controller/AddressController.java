package com.vg.addressapp.controller;

import com.vg.addressapp.response.AddressResponse;
import com.vg.addressapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
        AddressResponse addressResponse = addressService.getAddressReponseForEmployeeId(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
