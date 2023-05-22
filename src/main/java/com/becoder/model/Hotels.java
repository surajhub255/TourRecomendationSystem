package com.becoder.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String area;

    private String city;

    private String overview;

    private String rating;

    private String address;


}
