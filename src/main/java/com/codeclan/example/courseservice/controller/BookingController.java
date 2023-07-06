package com.codeclan.example.courseservice.controller;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
    BookingRepo bookingRepo;

    @GetMapping(value = "/bookings")
    public List<Booking> getBookings() {
        return bookingRepo.findAll();
    }

    @GetMapping(value = "/booking/{id}")
    public Optional<Booking> getBooking(@PathVariable Long id) {
        return bookingRepo.findById(id);
    }

}
