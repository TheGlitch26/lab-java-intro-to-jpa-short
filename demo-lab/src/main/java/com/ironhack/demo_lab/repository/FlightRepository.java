package com.ironhack.demo_lab.repository;

import com.ironhack.demo_lab.entity.Flight;
import com.ironhack.demo_lab.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByCustomerId();
}
