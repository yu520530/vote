package com.e_sun_interview.vote.controller;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/records")
    // 這個地方需要顯示後台資料
    public List<Voting_items> listVotingItem() {
        return homeService.getVotingItemWithRecords();
    }

    @PostMapping("/records")
    public String createRecords(@RequestBody List<String> form){
//        cmsService.deleteVotingItem(id,item);
        return "Success";
    }
}
