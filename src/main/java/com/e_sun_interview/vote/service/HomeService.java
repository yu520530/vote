package com.e_sun_interview.vote.service;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public  List<Voting_items> getVotingItemWithRecords() {
        return homeRepository.findAll();
    }
}
