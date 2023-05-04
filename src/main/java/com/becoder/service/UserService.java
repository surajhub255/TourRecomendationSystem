package com.becoder.service;

import com.becoder.model.Places;
import com.becoder.model.Restaurant;
import com.becoder.model.UserDtls;
import com.becoder.model.hotels;

import java.util.List;

public interface UserService {

    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);

    List<hotels> getAllHotels();

    List<Restaurant> getAllRestaurants();

    List<Places> getAllPlaces();
}