package com.becoder.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
public class Hotels extends AbstractPersistable<Long>{

    private String Area;

    private String City;

    private String Overview;

    private String Rating;
    private String IsValue;
    private String Address;


}
