package com.becoder.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;


@Entity
@Data
@Table(name = "hotels")
public class Hotels extends AbstractPersistable<Long>{

    private String Area;

    private String City;

    private String Overview;

    private String Rating;
    private String IsValue;
    private String Address;


}
