package com.becoder.controller;

import com.becoder.model.Hotels;
import com.becoder.model.Places;
import com.becoder.model.Restaurants;
import com.becoder.model.UserDtls;
import com.becoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signin")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/Option")
    public String option() {
        return "user/Option";
    }

    @GetMapping("/HLocation")
    public String HLocation() {
        return "user/HLocation";
    }

    @GetMapping("/PLocation")
    public String PLocation() {
        return "user/PLocation";
    }

    @GetMapping("/RLocation")
    public String RLocation() {
        return "user/RLocation";
    }

    @GetMapping("/Hotels")
    public String getAllHotels(Model model){
        List<Hotels> hotelsList = userService.getAllHotels();
        model.addAttribute("Hotels", hotelsList);
        return "user/Hotels";
    }

    @GetMapping("/Restaurants")
    public String getAllRestaurants(Model model){
        List<Restaurants> restaurantsList = userService.getAllRestaurants();
        model.addAttribute("Restaurants", restaurantsList);
        return "user/Restaurants";
    }

    @GetMapping("/Places")
    public String getAllPlaces(Model model){
        List<Places> placesList = userService.getAllPlaces();
        model.addAttribute("Places", placesList);
        return "user/Places";
    }





    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDtls user, HttpSession session) {


        boolean f = userService.checkEmail(user.getEmail());

        if (f) {
            session.setAttribute("msg", "Email Id alreday exists");
        }

        else {
            UserDtls userDtls = userService.createUser(user);
            if (userDtls != null) {
                session.setAttribute("msg", "Register Successfully");
            } else {
                session.setAttribute("msg", "Something wrong on server");
            }
        }

        return "redirect:/register";
    }

}