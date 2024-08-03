package com.bandeirath.resmind.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "authority")
    private String authority;

    @ManyToMany(mappedBy = "authorities")
    @JsonIgnoreProperties("users")
    private List<User> users;

}

