package story_client.ds.models;

import java.util.UUID;

import lombok.Data;

@Data
public class Terrain {

    private UUID id;
    private String name;
    private int sizeBeauty;

}
