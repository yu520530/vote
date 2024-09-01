package com.e_sun_interview.vote.controller;

import com.e_sun_interview.vote.DB.Voting_items;
import com.e_sun_interview.vote.common.ChangeFormat;
import com.e_sun_interview.vote.service.HomeService;
import io.swagger.v3.core.util.Json;
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
    public String createRecords(@RequestBody ChangeFormat form){
        homeService.createRecords(form);
        return "Success";
    }
}
