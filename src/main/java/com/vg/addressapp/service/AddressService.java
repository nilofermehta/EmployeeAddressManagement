package com.vg.addressapp.service;

import com.vg.addressapp.entity.Address;
import com.vg.addressapp.repo.AddressRepository;
import com.vg.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse getAddressReponseForEmployeeId(int employeeId) {
        Address address = addressRepository.findAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
        return addressResponse;
    }
}
