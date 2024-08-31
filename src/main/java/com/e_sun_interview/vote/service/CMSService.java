package com.e_sun_interview.vote.service;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.repository.CMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CMSService {

    @Autowired
    CMSRepository cmsRepository;

    public List<Voting_items> getVotingItem() {
        return cmsRepository.findAll();
    }

    public void createVotingItem(Voting_items item){
        cmsRepository.save(item);
    }

    public void deleteVotingItem(int id,Voting_items item2){
        Voting_items item = cmsRepository.getReferenceById(id);
        cmsRepository.delete(item);
    }
}
