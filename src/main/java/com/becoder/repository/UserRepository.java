package com.becoder.repository;

import com.becoder.model.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.model.UserDtls;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {



    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);

    static List<Hotels> getAll() {
        return null;
    }
}

