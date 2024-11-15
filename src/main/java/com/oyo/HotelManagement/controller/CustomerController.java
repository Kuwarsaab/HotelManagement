package com.oyo.HotelManagement.controller;

import com.oyo.HotelManagement.dto.request.CustomerRequestDto;
import com.oyo.HotelManagement.dto.response.CustomerResponseDto;
import com.oyo.HotelManagement.entity.Customer;
import com.oyo.HotelManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public boolean createCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return customerService.createCustomer(customerRequestDto);
    }

    @GetMapping("/")
    public CustomerResponseDto getCustomer(@RequestParam Integer customerId){
        return customerService.getCustomerDetails(customerId);
    }

    @GetMapping("/email")
    public CustomerResponseDto getCustomerByEmail(@RequestParam("email") String email){
        return customerService.getCustomerByEmail(email);
    }

}
