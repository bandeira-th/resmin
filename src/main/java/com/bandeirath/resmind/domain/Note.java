package com.bandeirath.resmind.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "title")
    private String title;


}
