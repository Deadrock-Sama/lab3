package Clothes;

import java.util.ArrayList;

public class ClothesElement extends Clothes {

    public ClothesElement(String name)
    {
        this.name = name;
    }

    protected ArrayList<ClothesFeatures> getFeatures() {
        return features;
    }

    protected void addFeature(ClothesFeatures feature) {
        if (!features.contains(feature)) {
            features.add(feature);
        }
    }

    public String toString() {

        return name;

    }

    private String name;
    private ArrayList<ClothesFeatures> features = new ArrayList<>();
}
