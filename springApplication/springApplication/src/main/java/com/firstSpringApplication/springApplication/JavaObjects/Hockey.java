package com.firstSpringApplication.springApplication.JavaObjects;

import com.firstSpringApplication.springApplication.Enums.League;
import com.firstSpringApplication.springApplication.Enums.Level;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hockey {

    private int competitorNumber;
    private Name name;
    private Level level;
    private League league;
    private int[] ratings;
}
