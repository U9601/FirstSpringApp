package Controller;

import Entity.HockeyDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompetitorController {

    @GetMapping
    public @ResponseBody
    HockeyDto getHockeyCompetitor(@PathVariable Integer competitorID){

    }

}
