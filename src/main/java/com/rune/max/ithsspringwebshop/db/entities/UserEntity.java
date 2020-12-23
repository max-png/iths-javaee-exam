package com.rune.max.ithsspringwebshop.db.entities;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    public int id;

    @Column
    public String name;

    @Column
    public String email;


}
