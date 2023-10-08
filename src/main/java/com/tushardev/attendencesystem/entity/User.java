package com.tushardev.attendencesystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "user_details")
public class User {

    @Id
    @Column(name = "UserId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name = "UserName")
    private String userName;
    @Column(name = "UserEmail")
    private String userEmailId;

    @Column(name = "UserPhoneNo")
    private Integer userPhoneNo;


}
