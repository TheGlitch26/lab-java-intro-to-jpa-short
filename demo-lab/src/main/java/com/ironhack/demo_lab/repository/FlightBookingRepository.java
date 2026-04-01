package com.ironhack.demo_lab.repository;

import com.ironhack.demo_lab.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
}
