package Stories.RidgesOfMadness;

import Clothes.ClothesElement;
import Clothes.ClothesFeatures;
import LivingEntities.People.Kidnappers;
import Situations.Heat;
import Stories.IStoryable;

public class KidnappersPart implements IStoryable {

    public KidnappersPart(RidgesOfMadness ridgesOfMadness) {
        this.ridgesOfMadness = ridgesOfMadness;
    }

    @Override
    public void narrate() {

        System.out.println("\nА вот что происходило до того, как ученые достигли этого места:\n");

        Kidnappers kidnappers = new Kidnappers(true);
        stealClothes();
        kidnappers.moveForward();
        ridgesOfMadness.situationsManager.add(new Heat());
        leftClothes();
        kidnappers.moveForward();
    }

    private void stealClothes() {

        System.out.println("Бандиты своровали одежду");

        ridgesOfMadness.clothesManager.addFeature(ClothesFeatures.WITH_SLITS);

        System.out.println("Бандиты порезали одежду, подгоняя ее под себя");

    }

    private void leftClothes() {

        System.out.println("Бандиты выбросили одежду в кучу");

    }

    private RidgesOfMadness ridgesOfMadness;
}
