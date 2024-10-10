package com.example.lab4crudtry2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab4CrudTry2Application implements CommandLineRunner{

    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Lab4CrudTry2Application.class, args);
    }

    @Override
    public void run(String... args){
        repository.deleteAll();

        repository.save(new Customer("Mira", "Holy"));
        repository.save(new Customer("Bob", "Holy"));
        repository.save(new Customer("Jack", "Holy"));

        for(Customer customer: repository.findAll()){
            System.out.println(customer);
        }

        System.out.println("===================================");
        System.out.println(repository.findByFirstName("Mira"));
        System.out.println("===================================");

        for(Customer customer: repository.findByLastName("Holy")){
            System.out.println(customer);
        }
    }
}
