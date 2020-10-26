package story_client.ds.utils;


import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class FData {
    private static final Random rand = new Random();
    private static final List<String> names = Arrays.asList("Evgenia", "Olha", "Inna", "Irina");
    private static final List<String> kingFood = Arrays.asList("Cheese", "Jam", "Bread", "Apple");
    private static final List<String> namePlace = Arrays.asList("Forest", "Meadow", "Town");
    private static final List<Integer> sizeMind  = Arrays.asList(10, 20, 30, 40, 50 ,60);
    private static final List<Integer> sizeCunning = Arrays.asList(10, 20, 30, 40, 50 ,60);
    private static final List<Integer> sizeEnergy  = Arrays.asList(10, 20, 30, 40, 50 ,60);
    private static final List<Integer> sizeBeauty  = Arrays.asList(10, 20, 30, 40, 50 ,60,70,80,90,100);
    private static final List<Integer> sizeTaste  = Arrays.asList(10, 20, 30, 40, 50 ,60,70,80,90,100);
    private static final List<Date> datesFood = Arrays.asList(new Date(2020-10-10),new Date(2020-10-11),new Date(2020-10-4));
    private static final List<Date> datesAnimal = Arrays.asList(new Date(2020-10-10),new Date(2020-10-1),new Date(2020-10-5));
    private static final List<Date> datesDeity = Arrays.asList(new Date(2020-10-10),new Date(2020-10-2),new Date(2020-10-3));

    public static String getName(){return names.get(rand.nextInt(names.size()));}

    public static String getKindFood(){return kingFood.get(rand.nextInt(kingFood.size()));}

    public static String getNamePlace(){return namePlace.get(rand.nextInt(namePlace.size()));}

    public static int getSizeTaste(){return sizeTaste.get(rand.nextInt(sizeTaste.size()));}

    public static int getSizeMind(){return sizeMind.get(rand.nextInt(sizeMind.size()));}

    public static int getSizeEnergy(){return sizeEnergy.get(rand.nextInt(sizeEnergy.size()));}

    public static int getSizeCunning(){return sizeCunning.get(rand.nextInt(sizeCunning.size()));}

    public static int getSizeBeauty(){return sizeBeauty.get(rand.nextInt(sizeBeauty.size()));}

    public static Date getDatesFood(){return datesFood.get(rand.nextInt(datesFood.size()));}

    public static Date getDatesAnimal(){return datesAnimal.get(rand.nextInt(datesAnimal.size()));}

    public static Date getDatesDeity(){return datesDeity.get(rand.nextInt(datesDeity.size()));}

}