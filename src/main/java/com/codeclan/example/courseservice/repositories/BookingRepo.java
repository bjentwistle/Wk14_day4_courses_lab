package com.codeclan.example.courseservice.repositories;

import com.codeclan.example.courseservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;
import java.util.List;

public interface BookingRepo extends JpaRepository<Booking, Long> {



}
