package com.firstSpringApplication.springApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "HOCKEY_COMPETITOR", schema = "AE9_COMPETITORS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HockeyDto {

    @Id
    @Column(name = "COMPETITOR_NUMBER")
    private int competitorNumber;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;


    @Column(name ="ABILITY")
    private String level;

    private String league;

    private String scores;

}
