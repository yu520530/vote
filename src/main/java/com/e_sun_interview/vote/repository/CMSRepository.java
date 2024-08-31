package com.e_sun_interview.vote.repository;

import com.e_sun_interview.vote.DB.Voting_items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CMSRepository extends JpaRepository<Voting_items, Integer> {
}
