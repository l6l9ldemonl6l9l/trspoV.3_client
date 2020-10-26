package story_client.ds.controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import story_client.ds.models.Food;
import story_client.ds.payload.FoodPayload;
import story_client.ds.request.Request;
import story_client.ds.utils.FData;
import story_client.ds.utils.Logging;

import java.io.IOException;
import java.util.Random;

public class FoodTest {
    private final String endPoint = "http://localhost:8081/food";

    private final Random rand = new Random();

    public void createFood(int foodNumber) throws IOException {
        for (int i=0; i<foodNumber; i++){
            Request post = Request.builder()
                    .type(new HttpPost(endPoint))
                    .body(new FoodPayload(FData.getSizeTaste(),FData.getKindFood(),FData.getDatesFood()))
                    .response(Food.class).build();
            Logging.printObject(post.send(), "Creating Food");
        }
    }

    public Food getRandomFood() throws IOException {
        Request get = Request.builder()
                .type(new HttpGet(endPoint))
                .body(null)
                .response(Food[].class).build();
        Food[] foods = (Food[]) get.send();
        return foods[rand.nextInt(foods.length)];
    }


    public void testService() throws IOException{
        System.out.println("Food service testing".toUpperCase());
        createFood(1);
    }
}