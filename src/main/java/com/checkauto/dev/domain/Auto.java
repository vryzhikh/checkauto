package com.checkauto.dev.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author vladov
 *         06/10/2017
 */
@Data
@Entity
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private LocalDateTime oil;
    private LocalDateTime oilFilter;
    private LocalDateTime airFilter;
    private LocalDateTime brakePads;
    private LocalDateTime tires;
    private LocalDateTime belt;
}
