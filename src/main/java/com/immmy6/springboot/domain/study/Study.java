package com.immmy6.springboot.domain.study;

import com.immmy6.springboot.domain.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "study")
    private List<User> users = new ArrayList<User>();
}
