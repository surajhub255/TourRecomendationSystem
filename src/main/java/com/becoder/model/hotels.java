package com.becoder.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "hotels")
public class hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String HOTELS;

    private String PLACE;

    private String LAT;

    private String LON;


}
