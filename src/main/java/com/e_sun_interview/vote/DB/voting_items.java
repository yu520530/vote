package com.e_sun_interview.vote.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// voting_items紀錄所有投票項目之名稱、ID
@Getter
@Setter
@Entity
@Table
public class voting_items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

}
