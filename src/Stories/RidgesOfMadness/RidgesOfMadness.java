package Stories.RidgesOfMadness;


import Clothes.ClothesElement;
import Clothes.ClothesFeatures;
import Clothes.ClothesManager;
import Places.PlacesManager;
import Situations.SituationsManager;
import Stories.IStoryable;

public class RidgesOfMadness implements IStoryable {

    protected ClothesManager clothesManager = new ClothesManager();
    protected PlacesManager mainPlaceManager = new PlacesManager();
    protected PlacesManager secondaryPlaceManager = new PlacesManager();
    protected SituationsManager situationsManager = new SituationsManager();

    @Override
    public void narrate() {

        prepareClothes();
        startKidnappersPart();
        situationsManager = new SituationsManager();
        startScientistsPart();

    }

    private void prepareClothes() {

        var jacket = new ClothesElement("куртка");
        var cloak = new ClothesElement("палатка");

        clothesManager.Add(jacket);
        clothesManager.Add(cloak);

        clothesManager.addFeature(ClothesFeatures.WARM);
        clothesManager.addFeature(jacket, ClothesFeatures.FUR);

    }

    private void startKidnappersPart() {

        KidnappersPart part = new KidnappersPart(this);
        part.narrate();

    }

    private void startScientistsPart() {

        ScientistsPart part = new ScientistsPart(this);
        part.narrate();

    }
}
