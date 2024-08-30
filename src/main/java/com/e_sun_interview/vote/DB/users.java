package com.e_sun_interview.vote.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// users紀錄所有使用者之姓名、ID
@Getter
@Setter
@Entity
@Table
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

}
