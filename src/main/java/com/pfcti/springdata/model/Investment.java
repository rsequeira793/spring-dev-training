package com.pfcti.springdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Investment {
    @Id
    private int id;
    private String number;
    private String type;
    @ManyToOne
    @JoinColumn(name = "client_id", columnDefinition = "id")
    private Client client;
}
