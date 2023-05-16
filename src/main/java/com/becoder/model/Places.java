package com.becoder.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Places extends AbstractPersistable<Long> {

    private String City;

    private String Place;

    private String Review;

    private String Rating;

}


