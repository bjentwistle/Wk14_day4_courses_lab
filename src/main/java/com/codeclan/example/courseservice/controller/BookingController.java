package com.codeclan.example.courseservice.controller;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/bookings/{id}")
    public ResponseEntity<Optional<Booking>> getBookingById(@PathVariable Long id) {
        return new ResponseEntity<>(bookingRepo.findById(id), HttpStatus.OK);
    }

}
