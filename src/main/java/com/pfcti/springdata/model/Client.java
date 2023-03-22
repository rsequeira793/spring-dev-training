package com.pfcti.springdata.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="client")
@Getter
@Setter
public class Client {
    @Id
    private int id;
    @Column(length = 10)
    private String name;
    @Column(length = 30)
    private String lastName;
    @Column(columnDefinition = "varchar(15)")
    private String identification;
    private String phone;

}
