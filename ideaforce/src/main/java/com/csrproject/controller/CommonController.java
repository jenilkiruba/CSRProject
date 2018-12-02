package com.csrproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

/**
 * Created by kaushv5 on 11/25/2018.
 */
@Controller
@RequiredArgsConstructor
public class CommonController {

    @Autowired
    private final ChallengeRepository challengeRepository;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String home(Principal principal) {
        return "index";
    }

    @RequestMapping("/challenges")
    public void challengesList(Principal principal, Model model) {
        List<ChallengeEntity> challengeEntityList = challengeRepository.findAll();
        model.addAttribute("challenges", challengeEntityList);
    }

    @RequestMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @RequestMapping("/leaderboard")
    public String LeaderBoard() {
        return "leaderboard";
    }
}
