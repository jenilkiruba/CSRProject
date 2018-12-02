package com.csrproject.controller;

<<<<<<< HEAD
import com.csrproject.model.Challenges;
import com.csrproject.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780

/**
 * Created by kaushv5 on 11/25/2018.
 */
@Controller
public class CommonController {

<<<<<<< HEAD
    @Autowired
    ChallengeRepository challengeRepository;

=======
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780
    @RequestMapping("/home")
    public String HomePage(){
        return "index";
    }

<<<<<<< HEAD
=======
    @RequestMapping("/challenges")
    public String Challenges(){
        return "challenges";
    }

>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780
    @RequestMapping("/gallery")
    public String Gallery(){
        return "gallery";
    }

    @RequestMapping("/leaderboard")
    public String LeaderBoard(){
        return "leaderboard";
    }
<<<<<<< HEAD

    @RequestMapping("/challenges")
    public ModelAndView getChallenges(Model model){
        ModelAndView mv = new ModelAndView("challenges");
        mv.addObject("challenges",challengeRepository.findAll());
        System.out.println("Challenges are :" + challengeRepository.findAll());
        return mv;
    }
    @RequestMapping("/challenges/{id}")
    public ModelAndView getChallengeByID(@PathVariable Long id, Model model) throws Exception {
        if(!challengeRepository.findById(id).isPresent()){
            throw new Exception("Student Not Found with ID :" + id);
        }
        ModelAndView mv1 = new ModelAndView("challengedetail");
        challengeRepository.findById(id).ifPresent(o -> model.addAttribute("challenge",o));
        System.out.println("Challenge is"+ challengeRepository.findById(id).toString());
        return mv1;
    }
=======
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780
}
