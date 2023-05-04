package com.becoder.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Places extends AbstractPersistable<Long> {

    private String placeToVisit;

    private String PLACE;

    private String LAT;

    private String LON;

}
