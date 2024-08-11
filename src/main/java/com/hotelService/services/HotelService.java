package com.hotelService.services;

import com.hotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();

    Hotel get(String id);
    
    
}
