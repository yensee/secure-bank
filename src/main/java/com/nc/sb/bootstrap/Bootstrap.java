package com.nc.sb.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nc.sb.constants.Role;
import com.nc.sb.models.user.BankStaff;
import com.nc.sb.models.user.Customer;
import com.nc.sb.models.user.User;
import com.nc.sb.repositories.user.BankStaffRepository;
import com.nc.sb.repositories.user.CustomerRepository;
import com.nc.sb.repositories.user.UserRepository;

@Component
public class Bootstrap implements CommandLineRunner{

    private UserRepository userRepository;
    private CustomerRepository customerRepository;
    private BankStaffRepository bankStaffRepository;

    public Bootstrap(UserRepository userRepository, 
                        CustomerRepository customerRepository,
                        BankStaffRepository bankStaffRepository) {
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
        this.bankStaffRepository = bankStaffRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();


        user1.setUsername("john"); //for John Doe
        user2.setUsername("amanda"); //for Amanda Cloud
        user3.setUsername("vishesh"); //for Visesh Gowda
        user4.setUsername("chirant");  //for Chirant Prashanth
        user5.setUsername("mark"); //fir Mark Adams
        
        user1.setPassword("sunny"); //for John Doe
        user2.setPassword("bright"); //for Amanda Cloud
        user3.setPassword("rainy"); //for Visesh Gowda
        user4.setPassword("winter");  //for Chirant Prashanth
        user5.setPassword("spring"); //fir Mark Adams

        user1.setEmail("john.d@email.com"); //for John Doe
        user2.setEmail("amanda.d@email.com"); //for Amanda Cloud
        user3.setEmail("vishesh.g@email.com"); //for Visesh Gowda
        user4.setEmail("chirant.p@email.com");  //for Chirant Prashanth
        user5.setEmail("mark.a@email.com"); //fir Mark Adams

        user1.setRole(Role.SYSTEM_ADMIN); //for John Doe
        user2.setRole(Role.BANK_STAFF); //for Amanda Cloud
        user3.setRole(Role.CUSTOMER); //for Visesh Gowda
        user4.setRole(Role.CUSTOMER);  //for Chirant Prashanth
        user5.setRole(Role.BANK_STAFF); //fir Mark Adams


        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);

        Customer user6 = new Customer("adam", "summer", "adam.s@email.com", "67464TY67", 789743.00,  "Open");

        customerRepository.save(user6);

        BankStaff user7 = new BankStaff("tocher", "sunshine", "mark.t@email.com", "789", true);
        bankStaffRepository.save(user7);

        System.out.println("User Loaded = " + userRepository.count() );
        System.out.println("Customer Loaded = " + customerRepository.count() );
        System.out.println("Bank Staff Loaded = " + bankStaffRepository.count() );
    }
}