package com.firstSpringApplication.springApplication.Services;

import com.firstSpringApplication.springApplication.Entity.HockeyDto;
import com.firstSpringApplication.springApplication.JavaObjects.Hockey;
import com.firstSpringApplication.springApplication.Mapper.HockeyMapper;
import com.firstSpringApplication.springApplication.Repository.HockeyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
@Slf4j
public class HockeyService {

    private HockeyRepository hockeyRepository;
    private HockeyMapper hockeyMapper;

    public Hockey getHockeyCompetitor(Integer competitorNumber){
        HockeyDto hockeyDto = hockeyRepository.findHockeyCompetitor(competitorNumber);
        if(hockeyDto == null){
            log.error("Competitor does not exist");
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Competitor Number " +competitorNumber+ " does not exist"
            );
        }
        log.info("Found Competitor {}", hockeyDto);
        return hockeyMapper.mapHockeyDtoToHockey(hockeyDto);
    }
}
