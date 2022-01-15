package com.firstSpringApplication.springApplication.JavaObjects;

import com.firstSpringApplication.springApplication.Enums.League;
import com.firstSpringApplication.springApplication.Enums.Level;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Hockey {

    private int competitorNumber;
    private Name name;
    private Level level;
    private League league;
    private int[] ratings;
}
