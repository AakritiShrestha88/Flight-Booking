package com.flightbooking.repository;


import com.flightbooking.entities.Booking;
import com.flightbooking.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

    @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and operatingAirlines=:operatingAirlines and dateOfDeparture=:dateOfDeparture order by price")
     List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("operatingAirlines") String operatingAirlines,@Param("dateOfDeparture") Date departureDate);

//    Booking deleteById(int id);
}
