package com.becoder.controller;

import com.becoder.model.Hotels;
import com.becoder.repository.DataRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DataController {

        @Autowired
        private DataRepository dataRepository;

        @GetMapping("/data")
        public String getData(Model model) {
            List<Hotels> dataList = dataRepository.findAll();
            model.addAttribute("dataList", dataList);
            return "data";
        }
    }

