package story_client.ds;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import story_client.ds.controller.CrowTest;
import story_client.ds.controller.FoxTest;
import story_client.ds.controller.TerrainTest;
import story_client.ds.controller.DeityTest;
import story_client.ds.controller.FoodTest;


@SpringBootApplication
public class StoryApplication {

    public static void main(String[] args) {
        try{
            FoodTest Food = new FoodTest();
            Food.testService();

            CrowTest Crow = new CrowTest();
            Crow.testService();

            FoxTest Fox = new FoxTest();
            Fox.testService();

            TerrainTest place = new TerrainTest();
            place.testService();

            DeityTest Deity = new DeityTest();
            Deity.testService();

        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
