package com.example.lab4crudtry2;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}