package story_client.ds.controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import story_client.ds.models.Terrain;
import story_client.ds.payload.TerrainPayload;
import story_client.ds.request.Request;
import story_client.ds.utils.FData;
import story_client.ds.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class TerrainTest {
    private final String endPoint = "http://localhost:8080/api/Terrain";

    private final Random rand = new Random();

    public void createTerrain(int TerrainNumber) throws IOException {
        for (int i=0; i<TerrainNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new TerrainPayload(FData.getNamePlace(),FData.getSizeBeauty()))
                    .response(Terrain.class).build();
            Logging.printObject(post.send(), "Creating Terrain");
        }
    }

    public Terrain getRandomTerrain() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Terrain[].class).build();
        Terrain[] Terrains = (Terrain[]) get.send();
        return Terrains[rand.nextInt(Terrains.length)];
    }


    public void testService() throws IOException{
        System.out.println("Terrain service testing".toUpperCase());
        createTerrain(1);
        System.out.println("Terrain service testing END".toUpperCase());
    }
}