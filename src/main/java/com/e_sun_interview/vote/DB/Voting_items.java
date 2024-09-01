package com.e_sun_interview.vote.DB;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// voting_items紀錄所有投票項目之名稱、ID
@Getter
@Setter
@Entity
@Table
public class Voting_items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;


    @OneToMany(targetEntity = Records.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "itemId", referencedColumnName = "id")
    private Set<Records> records = new HashSet<>();


}
