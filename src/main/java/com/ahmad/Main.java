package com.ahmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

//To make this a spring boot application we add @Spring-boot-application annotation to this
@SpringBootApplication
@RestController
@RequestMapping("api/v1/product")
//@RequestMapping("api/v1/school")
//@RequestMapping("api/v1/customers")
//@EnableSwagger2
public class Main {

    private final CustomerRepository CustomerRepository;

    public Main(CustomerRepository customerRepository,
                com.ahmad.SchoolRepository schoolRepository,
                com.ahmad.ProductRepository productRepository) {
        CustomerRepository = customerRepository;
        SchoolRepository = schoolRepository;
        ProductRepository = productRepository;
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
//    @PostMapping
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

//    @GetMapping
    public List <School> getSchool(){
        return SchoolRepository.findAll();
    }

    record NewSchoolRequest(
            String schoolName,
            String schoolOwner,
            String schoolHead,
            String schoolEmail,
            String schoolAddress
    ){

    }

//    @PostMapping
    public void addSchool(@RequestBody NewSchoolRequest request){
        School school = new School();
        school.setSchoolName(request.schoolName());
        school.setSchoolOwner(request.schoolOwner());
        school.setSchoolHead(request.schoolHead());
        school.setSchoolEmail(request.schoolEmail());
        school.setSchoolAddress(request.schoolAddress());
        SchoolRepository.save(school);
    }


    private final ProductRepository ProductRepository;

    @GetMapping
    public List<Product> getProducts(){
        return ProductRepository.findAll();
    }

    record NewProductRequest(
            String name,
            Integer size,
            Integer quantity,
            Float price,
            Float weight,
            Boolean isAvailable,
            Date stock_in_date,
            Date stock_out_date
    ){
    }

    @PostMapping
    public void addProduct(@RequestBody NewProductRequest request){
        Product product = new Product();
        product.setName(request.name());
        product.setSize(request.size());
        product.setQuantity(request.quantity());
        product.setPrice(request.price());
        product.setWeight(request.weight());
        product.setAvailable(request.isAvailable());
        product.setStock_in_date(request.stock_in_date());
        product.setStock_out_date(request.stock_out_date());
        ProductRepository.save(product);
    }



}
