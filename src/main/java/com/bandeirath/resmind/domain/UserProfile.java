package com.bandeirath.resmind.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    private Avatar avatar;

    @OneToMany(mappedBy = "users")
    private List<Note> notes;

    public UserProfile() {

    }

    public UserProfile(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
