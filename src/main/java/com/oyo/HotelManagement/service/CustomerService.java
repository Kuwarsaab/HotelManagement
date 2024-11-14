package com.oyo.HotelManagement.service;

import com.oyo.HotelManagement.dto.request.CustomerRequestDto;
import com.oyo.HotelManagement.dto.response.CustomerResponseDto;
import com.oyo.HotelManagement.entity.AdharDetails;
import com.oyo.HotelManagement.entity.Customer;
import com.oyo.HotelManagement.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public boolean createCustomer(CustomerRequestDto customerRequestDto) {
        Customer customer = convertCustomerRequestDtoToCustomer(customerRequestDto);
        AdharDetails adharDetails = customer.getAdharDetails();
        adharDetails.setCustomer(customer);
        customerRepository.save(customer);
        return true;
    }

    private Customer convertCustomerRequestDtoToCustomer(CustomerRequestDto customerRequestDto) {
        Customer customer = new Customer();
        customer.setName(customerRequestDto.getName());
        customer.setPhoneNumber(customerRequestDto.getPhoneNumber());
        customer.setEmail(customerRequestDto.getEmail());
        customer.setAdharDetails(customerRequestDto.getAdharDetails());
        return customer;
    }

    public CustomerResponseDto getCustomerDetails(Integer customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return convertCustomerToCustomerResponseDto(customer.get());
    }

    private CustomerResponseDto convertCustomerToCustomerResponseDto(Customer customer) {
        CustomerResponseDto customerResponseDto = new CustomerResponseDto();
        customerResponseDto.setName(customer.getName());
        customerResponseDto.setEmail(customer.getEmail());
        customerResponseDto.setPhoneNumber(customer.getPhoneNumber());
        customerResponseDto.setAdharDetails(customer.getAdharDetails());
        return customerResponseDto;

    }
}
