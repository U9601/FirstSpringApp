package com.firstSpringApplication.springApplication.Controller;

import com.firstSpringApplication.springApplication.JavaObjects.Hockey;
import com.firstSpringApplication.springApplication.Services.HockeyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;


@Controller
@AllArgsConstructor
@Slf4j
public class CompetitorController {

    private HockeyService hockeyService;


    @GetMapping("/hockey/{competitorId}")
    public @ResponseBody Hockey getHockeyCompetitor(@PathVariable Integer competitorId){
        return hockeyService.getHockeyCompetitor(competitorId);
    }

    @GetMapping("/")
    public ModelAndView getHockeyCompetitor(){
       return new ModelAndView("addHockey", "hockeyAdd", new Hockey());
   }

   @PostMapping("/addHockey")
   public String submit(@ModelAttribute("hockeyAdd") Hockey hockey, BindingResult result, ModelMap map){
       if (result.hasErrors()) {
           return "error";
       }

       map.addAttribute("competitorNumber", hockey.getCompetitorNumber());
       map.addAttribute("firstName", hockey.getName().getFirstName());
       map.addAttribute("middleName", hockey.getName().getMiddleName());
       map.addAttribute("lastName", hockey.getName().getLastName());
       map.addAttribute("level", hockey.getLevel().name());
       map.addAttribute("league", hockey.getLeague().name());
       map.addAttribute("ratings", hockey.getRatings());
       hockeyService.addHockeyCompetitor(hockey);
       return "hockey";
   }

    @GetMapping("/hockeyBulk")
    public @ResponseBody List<Hockey> getHockeyCompetitorBulk(){
        return hockeyService.getHockeyCompetitorBulk();
    }

    @GetMapping( "/helloWorld")
    public @ResponseBody String test(){
        return "hello World";
    }

}
