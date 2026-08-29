package com.example.resourcebookingsystem.Repository;
 

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resourcebookingsystem.Entity.Reservation;
import com.example.resourcebookingsystem.Entity.ReservationStatus;
import com.example.resourcebookingsystem.Entity.User;

import java.math.BigDecimal;

public interface ReservationRepository
        extends JpaRepository<Reservation, Long> {

    Page<Reservation> findByUser(
            User user,
            Pageable pageable
    );

    Page<Reservation> findByStatus(
            ReservationStatus status,
            Pageable pageable
    );

    Page<Reservation> findByPriceGreaterThanEqual(
            BigDecimal minPrice,
            Pageable pageable
    );

    Page<Reservation> findByPriceLessThanEqual(
            BigDecimal maxPrice,
            Pageable pageable
    );
}
