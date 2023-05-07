package com.ahmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//To make this a spring boot application we add @Spring-boot-application annotation to this
@SpringBootApplication
@RestController
@RequestMapping("api/v1/school")
//@RequestMapping("api/v1/school")
//@EnableSwagger2
public class Main {

    private final CustomerRepository CustomerRepository;

    public Main(CustomerRepository customerRepository, com.ahmad.SchoolRepository schoolRepository) {
        CustomerRepository = customerRepository;
        SchoolRepository = schoolRepository;
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
        SpringApplication.run(Main.class, args);
    }

//    @GetMapping
    public List<Customer> getCustomers(){
        return CustomerRepository.findAll();
    }

    record NewCustomerRequest(
            String firstName,
            String lastName,
            String address,
            String email,
            String phone
    ){

    }
    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.firstName());
        customer.setLastName(request.lastName());
        customer.setAddress(request.address());
        customer.setEmail(request.email());
        customer.setPhone(request.phone());
        CustomerRepository.save(customer);

    }

    private final SchoolRepository SchoolRepository;

    @GetMapping
    public List <School> getSchool(){
        return SchoolRepository.findAll();
    }






}
