package com.becoder.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Restaurants extends AbstractPersistable<Long> {

    private String name;

    private String location;

    private String city;

    private String cuisine;
    private String rating;
    private String vote;
    private String cost;

}
