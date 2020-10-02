package story_client.ds.payload;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
public class DeityPayload {
    private String name;
    private Date age;

}
