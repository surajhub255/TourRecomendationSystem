package com.becoder.service;

import com.becoder.model.Places;
import com.becoder.model.Restaurant;
import com.becoder.model.hotels;
import com.becoder.repository.HotelRepository;
import com.becoder.repository.PlacesRepository;
import com.becoder.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.becoder.model.UserDtls;
import com.becoder.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private PlacesRepository placesRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncode;

    @Override
    public UserDtls createUser(UserDtls user) {

        user.setPassword(passwordEncode.encode(user.getPassword()));
        user.setRole("ROLE_USER");

        return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {

        return userRepo.existsByEmail(email);
    }

    @Override
    public List<hotels> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }


    @Override
    public List<Places> getAllPlaces() {
        return placesRepository.findAll();
    }
}