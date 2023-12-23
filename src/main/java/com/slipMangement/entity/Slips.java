package com.slipMangement.entity;

import jakarta.persistence.*;

@Entity
public class Slips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    //Build relationship between User and Slips
    @ManyToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //End of relationship part


}
