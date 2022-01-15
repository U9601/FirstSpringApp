package com.firstSpringApplication.springApplication.Mapper;

import com.firstSpringApplication.springApplication.Entity.HockeyDto;
import com.firstSpringApplication.springApplication.Enums.League;
import com.firstSpringApplication.springApplication.Enums.Level;
import com.firstSpringApplication.springApplication.JavaObjects.Hockey;
import com.firstSpringApplication.springApplication.JavaObjects.Name;
import org.springframework.stereotype.Component;

@Component
public class HockeyMapper {

    public Hockey mapHockeyDtoToHockey(HockeyDto hockeyDto){
        String[] values = hockeyDto.getScores().split(",");
        int[] scores = new int[values.length];
        for(int i =0; i < values.length; i++){
            scores[i] += Integer.parseInt(values[i]);
        }
        return Hockey.builder()
                .competitorNumber(hockeyDto.getCompetitorNumber())
                .name(Name.builder()
                        .firstName(hockeyDto.getFirstName())
                        .middleName(hockeyDto.getMiddleName())
                        .lastName(hockeyDto.getLastName())
                        .build())
                .level(Level.valueOf(hockeyDto.getLevel()))
                .league(League.valueOf(hockeyDto.getLeague()))
                .ratings(scores)
                .build();
    }

    public HockeyDto mapHockeyToHockeyDto(Hockey hockey){
        int[] scores = hockey.getRatings();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < scores.length; i++){
            sb.append(scores[i]);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);

        return HockeyDto.builder()
                .competitorNumber(hockey.getCompetitorNumber())
                .firstName(hockey.getName().getFirstName())
                .middleName(hockey.getName().getMiddleName())
                .lastName(hockey.getName().getLastName())
                .level(hockey.getLevel().name())
                .league(hockey.getLeague().name())
                .scores(sb.toString())
                .build();

    }
}
