package com.e_sun_interview.vote.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// records紀錄所有使用者投票之項目
@Getter
@Setter
@Entity
@Table
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
