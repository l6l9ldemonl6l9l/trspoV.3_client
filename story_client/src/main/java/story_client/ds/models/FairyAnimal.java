package story_client.ds.models;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class FairyAnimal {

    private UUID id;

    private String name;
    private Date lastLunchTime;
    private int energy;

}
