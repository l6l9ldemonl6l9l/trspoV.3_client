package story_client.ds.controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import story_client.ds.models.Fox;
import story_client.ds.payload.FoxPayload;
import story_client.ds.request.Request;
import story_client.ds.utils.FData;
import story_client.ds.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class FoxTest {
    private final String endPoint = "http://localhost:8085/fox";

    private final Random rand = new Random();

    public void createFox(int FoxNumber) throws IOException {
        for (int i=0; i<FoxNumber; i++){
            Request.RequestBuilder builder = Request.builder();
            builder.type(new HttpPost(endPoint));
            builder.body(new FoxPayload(FData.getName(),  FData.getSizeCunning(), FData.getDatesAnimal(),FData.getSizeEnergy()));
            builder.response(Fox.class);
            Request post = builder.build();
            Logging.printObject(post.send(), "Creating Fox");
        }
    }

    public Fox getRandomFox() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Fox[].class).build();
        Fox[] Foxs = (Fox[]) get.send();
        return Foxs[rand.nextInt(Foxs.length)];
    }


    public void testService() throws IOException{
        System.out.println("Fox service testing".toUpperCase());
        createFox(1);
    }
}