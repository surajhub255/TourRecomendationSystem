package com.becoder.repository;

import com.becoder.model.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Hotels, Long> {

}
