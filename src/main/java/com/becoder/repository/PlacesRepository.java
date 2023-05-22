package com.becoder.repository;


import com.becoder.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlacesRepository extends JpaRepository<Places,Integer> {
}
