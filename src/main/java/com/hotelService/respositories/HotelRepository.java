package com.hotelService.respositories;

import com.hotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <Hotel,String> {
}
