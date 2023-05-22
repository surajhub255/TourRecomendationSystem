package com.becoder.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
public class Hotels extends AbstractPersistable<Long>{

    private String area;

    private String city;

    private String overview;

    private String rating;

    private String address;


}
