package Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "HOCKEY_COMPETITOR")
@Entity
public class HockeyDto {

    @Id
    @Column(name = "COMPETITOR_NUMBER")
    private Integer competitorNumber;

}
