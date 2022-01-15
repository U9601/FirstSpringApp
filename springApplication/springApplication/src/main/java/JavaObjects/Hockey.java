package JavaObjects;

import Enums.League;
import Enums.Level;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hockey {

    private int competitorNumber;
    private Name name;
    private Level level;
    private League league;
    private int[] ratings;
}
