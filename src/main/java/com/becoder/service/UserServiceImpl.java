package com.becoder.service;

import com.becoder.model.Places;
import com.becoder.model.Restaurants;
import com.becoder.model.Hotels;
import com.becoder.repository.HotelRepository;
import com.becoder.repository.PlacesRepository;
import com.becoder.repository.RestaurantsRepository;
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
    private RestaurantsRepository restaurantRepository;

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
    public List<Hotels> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Restaurants> getAllRestaurants() {

        return restaurantRepository.findAll();
    }


    @Override
    public List<Places> getAllPlaces() {

        return placesRepository.findAll();
    }
}