package com.e_sun_interview.vote.service;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.common.ChangeFormat;
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

    public void createRecords(ChangeFormat form){
        System.out.println(form.name);
        System.out.println(form.votes.size());
//        form.votes.forEach((e)->{
//            Records records = new Records();
//            records.setUsername(form.name);
//            records.setItemId(e.toString());
//            System.out.println(records);
//            recordRepository.save(records);
//        });

    }
}
