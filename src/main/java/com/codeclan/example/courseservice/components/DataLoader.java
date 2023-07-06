package com.codeclan.example.courseservice.components;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.BookingRepo;
import com.codeclan.example.courseservice.repositories.CourseRepo;
import com.codeclan.example.courseservice.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    CourseRepo courseRepo;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        Course pythonForBeginners = new Course("Python for beginners", "Edinburgh", 5);
        courseRepo.save(pythonForBeginners);

        Course javaForBeginners = new Course("Java for beginners", "Glasgow", 2);
        courseRepo.save(javaForBeginners);

        Customer customer1 = new Customer("Sara Cox", "Edinburgh", 35);
        customerRepo.save(customer1);

        Customer customer2 = new Customer("Pete Tong", "Glasgow", 62);
        customerRepo.save(customer2);

        Booking booking1 = new Booking("11-7-2023", pythonForBeginners, customer1 );
        bookingRepo.save(booking1);

        Booking booking2 = new Booking("11-8-2023", javaForBeginners, customer2 );
        bookingRepo.save(booking2);
    }
}
