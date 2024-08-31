package com.e_sun_interview.vote.controller;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.service.CMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/cms")
public class CMSController {

    @Autowired
    CMSService cmsService;

    @GetMapping("/list")
    // 這個地方需要顯示後台資料
    public List<Voting_items> listVotingItem() {
        return cmsService.getVotingItem();
    }

    @PatchMapping("/create")
    public String createVotingItem(@RequestBody Voting_items item){
        cmsService.createVotingItem(item);
        return "Success";
    }

}
