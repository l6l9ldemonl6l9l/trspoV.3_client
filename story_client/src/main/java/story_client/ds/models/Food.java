package story_client.ds.models;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Food {

    private UUID id;
    private int taste;
    private String kindFood;
    private Date birthday;


}
