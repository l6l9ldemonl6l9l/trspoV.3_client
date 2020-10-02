package story_client.ds.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class FoodPayload {

    private int taste;
    private String kindFood;
    private Date birthday;


}
