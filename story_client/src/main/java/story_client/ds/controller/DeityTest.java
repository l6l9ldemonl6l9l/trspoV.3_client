package story_client.ds.controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import story_client.ds.models.Deity;
import story_client.ds.payload.DeityPayload;
import story_client.ds.request.Request;
import story_client.ds.utils.FData;
import story_client.ds.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class DeityTest {
    private final String endPoint = "http://localhost:8083/deity";

    private final Random rand = new Random();

    public void createDeity(int DeityNumber) throws IOException {
        for (int i=0; i<DeityNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new DeityPayload(FData.getName(), FData.getDatesDeity()))
                    .response(Deity.class).build();
            Logging.printObject(post.send(), "Creating Deity");
        }
    }

    public Deity getRandomDeity() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Deity[].class).build();
        Deity[] Deitys = (Deity[]) get.send();
        return Deitys[rand.nextInt(Deitys.length)];
    }


    public void testService() throws IOException{
        System.out.println("Deity service testing".toUpperCase());
        createDeity(1);
    }
}