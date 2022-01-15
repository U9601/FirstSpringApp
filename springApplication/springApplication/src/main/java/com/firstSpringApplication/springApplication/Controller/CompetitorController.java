package com.firstSpringApplication.springApplication.Controller;

import com.firstSpringApplication.springApplication.JavaObjects.Hockey;
import com.firstSpringApplication.springApplication.Services.HockeyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@AllArgsConstructor
@Slf4j
public class CompetitorController {

    private HockeyService hockeyService;


    @GetMapping("/hockey/{competitorId}")
    public @ResponseBody Hockey getHockeyCompetitor(@PathVariable Integer competitorId){
        return hockeyService.getHockeyCompetitor(competitorId);
    }

    @GetMapping( "/helloWorld")
    public @ResponseBody String test(){
        return "hello World";
    }

}
