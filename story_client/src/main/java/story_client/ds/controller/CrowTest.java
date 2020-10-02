package story_client.ds.controller;

import story_client.ds.models.Crow;
import story_client.ds.payload.CrowPayload;
import story_client.ds.request.Request;
import story_client.ds.utils.FData;
import story_client.ds.utils.Logging;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;
import java.util.Random;

public class CrowTest {
    private final String endPoint = "http://localhost:8080/api/crow";

    private final Random rand = new Random();

    public void createCrow(int crowNumber) throws IOException {
        for (int i=0; i<crowNumber; i++){
            Request.RequestBuilder builder = Request.builder();
            builder.type(new HttpPost(endPoint));
            builder.body(new CrowPayload(FData.getName(),  FData.getSizeMind(), FData.getDatesAnimal(),FData.getSizeEnergy()));
            builder.response(Crow.class);
            Request post = builder.build();
            Logging.printObject(post.send(), "Creating Crow");
        }
    }

    public Crow getRandomCrow() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Crow[].class).build();
        Crow[] Crows = (Crow[]) get.send();
        return Crows[rand.nextInt(Crows.length)];
    }


    public void testService() throws IOException{
        System.out.println("Crow service testing".toUpperCase());
        createCrow(1);
    }
}