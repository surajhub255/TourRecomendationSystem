package com.becoder.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Restaurants extends AbstractPersistable<Long> {

    private String Name;

    private String Location;

    private String City;

    private String Cuisine;
    private String Rating;
    private String Vote;
    private String Cost;

}
