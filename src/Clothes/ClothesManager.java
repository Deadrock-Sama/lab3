package Clothes;

import java.util.ArrayList;
import java.util.HashMap;

public class ClothesManager {

    private ArrayList<ClothesElement> clothes = new ArrayList<>();

    public void Add(ClothesElement clothesElement) {
        clothes.add(clothesElement);
    }

    public void Add(String nameOfClothe) {

        var clothe = new ClothesElement(nameOfClothe);
        this.Add(clothe);

    }

    public ArrayList<ClothesElement> getClothes() {
        return clothes;
    }

    public void addFeature(ClothesFeatures feature) {
        for (ClothesElement ce: clothes) {
            addFeature(ce, feature);
        }
    }

    public void addFeature(ClothesElement ce, ClothesFeatures feature) {
        ce.addFeature(feature);
    }

    @Override
    public String toString() {

        var featureNames = new HashMap<ClothesFeatures, String>();
        featureNames.put(ClothesFeatures.WITH_SLITS, "с прорезями ");
        featureNames.put(ClothesFeatures.FUR, "меховая ");
        featureNames.put(ClothesFeatures.WARM, "теплая ");

        String result = "Куча одежды, содержащая:\n" ;

        for (ClothesElement ce: clothes) {

            result += ce.toString() + " ";
            ArrayList<ClothesFeatures> features = ce.getFeatures();
            for (ClothesFeatures cf: features) {

                result += featureNames.get(cf);


            }
            result += "\n";

        }

        return result;
    }




}
