package com.firstSpringApplication.springApplication.Repository;

import com.firstSpringApplication.springApplication.Entity.HockeyDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HockeyRepository extends CrudRepository<HockeyDto, Integer> {

    @Query(value = "select h from HockeyDto h where h.competitorNumber =:competitorNumber")
    HockeyDto findHockeyCompetitor(@Param("competitorNumber") Integer competitorNumber);

}
