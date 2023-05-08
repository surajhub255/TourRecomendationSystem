package com.becoder.service;

import com.becoder.model.Places;
import com.becoder.model.Restaurants;
import com.becoder.model.UserDtls;
import com.becoder.model.Hotels;

import java.util.List;

public interface UserService {

    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);

   /* List<hotels> getAllHotels();*/

    List<Restaurants> getAllRestaurants();

    List<Places> getAllPlaces();

    List<Hotels> getAllHotels();
}