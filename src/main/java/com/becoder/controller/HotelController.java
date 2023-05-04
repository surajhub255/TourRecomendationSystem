package com.becoder.controller;

import com.becoder.model.Places;
import com.becoder.model.Restaurant;
import com.becoder.model.hotels;
import com.becoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("suraj/tms/api/v1/")
@RestController
public class HotelController {

    @Autowired
    private UserService userService;

    @GetMapping("getHotels/")
    public List<hotels> getAllHotels() {
        return userService.getAllHotels();

    }
    @GetMapping("getRestaurants/")
    public List<Restaurant> getAllRestaurants() {
        return userService.getAllRestaurants();

    }

    @GetMapping("getPlaces/")
    public List<Places> getAllPlaces() {
        return userService.getAllPlaces();

    }

}
