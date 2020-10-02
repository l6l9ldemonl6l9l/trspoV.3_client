package story_client.ds.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class FoxPayload  {
    private String name;
    private int sizeCunning;
    private Date lastLunchTime;
    private int energy;
}
