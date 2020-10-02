package story_client.ds.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class CrowPayload{
    private String name;
    private int sizeMind;
    private Date lastLunchTime;
    private int energy;
}
