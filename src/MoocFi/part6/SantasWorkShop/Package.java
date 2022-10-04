package MoocFi.part6.SantasWorkShop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }



    public void addGift(Gift gift){
        this.gifts.add(gift);

    }

    public int totalWeight() {
        int weight = 0;
        for (Gift gift1 : gifts) {
            weight += gift1.getWeight();
        }
        return weight;
    }

}
