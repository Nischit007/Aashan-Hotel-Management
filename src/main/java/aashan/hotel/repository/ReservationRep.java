package aashan.hotel.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aashan.hotel.entity.Reservation;

@Repository
public interface ReservationRep extends JpaRepository<Reservation, Integer> {
	
	Reservation findById(int resId);
	
	Collection<Reservation> findAllByUserId(int userId);

}
