package com.csrproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kaushv5 on 11/25/2018.
 */
@Controller
public class CommonController {

    @RequestMapping("/home")
    public String HomePage(){
        return "index";
    }

    @RequestMapping("/challenges")
    public String Challenges(){
        return "challenges";
    }

    @RequestMapping("/gallery")
    public String Gallery(){
        return "gallery";
    }

    @RequestMapping("/leaderboard")
    public String LeaderBoard(){
        return "leaderboard";
    }
}
