package com.emc.ideaforce.controller;

import com.emc.ideaforce.model.ChallengeDetail;
import com.emc.ideaforce.model.ChallengeEntry;
import com.emc.ideaforce.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

/**
 * Common web controller
 */
@Controller
@RequiredArgsConstructor
public class CommonController {

    public static final String CHALLENGES = "challenges";
    public static final String CHALLENGE_DETAIL = "challengedetail";
    public static final String CHALLENGE = "challenge";
    public static final String USER_CHALLENGES = "userchallenges";
    @Autowired
    private final CommonService commonService;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout, HttpSession httpSession) {

        ModelAndView model = new ModelAndView("login");
        if (logout != null) {
            httpSession.invalidate();
        }
        return model;
    }

    @RequestMapping("/")
    public String index(Principal principal) {
        return "index";
    }

    @RequestMapping("/home")
    public String home(Principal principal) {
        return "index";
    }

    @RequestMapping("/challenges")
    public ModelAndView challengesList(Principal principal) {
        List<ChallengeDetail> challengeDetailList = commonService.getChallengeDetailList();

        ModelAndView mv = new ModelAndView(CHALLENGES);
        mv.addObject(CHALLENGES, challengeDetailList);
        return mv;
    }

    @RequestMapping("/challenges/{id}")
    public ModelAndView challengeDetail(@PathVariable String id) {
        ChallengeDetail challengeDetail = commonService.getChallengeDetail(id);

        ModelAndView mv = new ModelAndView(CHALLENGE_DETAIL);
        mv.addObject(CHALLENGE, challengeDetail);
        return mv;
    }

    @RequestMapping("/user-challenges")
    public ModelAndView challengesTakenList(Principal principal) {
        List<ChallengeEntry> entries = commonService.getChallengesTakenList(principal.getName());

        ModelAndView mv = new ModelAndView(USER_CHALLENGES);
        mv.addObject(CHALLENGES, entries);
        return mv;
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
