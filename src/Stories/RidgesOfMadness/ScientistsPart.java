package Stories.RidgesOfMadness;

import LivingEntities.People.Scientists;
import Places.Cave;
import Places.Gallery;
import Places.Tunnel;
import Situations.*;
import Stories.IStoryable;

public class ScientistsPart implements IStoryable {

    public ScientistsPart(RidgesOfMadness ridgesOfMadness) {
        this.ridgesOfMadness = ridgesOfMadness;
    }
    @Override
    public void narrate() {

        System.out.println("\nА вот так складывалась история для ученых:\n");

        Scientists scientists = new Scientists(true);
        scientists.moveForward();
        var tunnel = new Tunnel();
        ridgesOfMadness.mainPlaceManager.enterPlace(tunnel);
        var steamJet = new SteamJet();
        ridgesOfMadness.situationsManager.addWithoutStart(steamJet);
        var heat = new Heat();
        ridgesOfMadness.situationsManager.addWithoutStart(heat);
        var smell = new Smell(SmellType.PUNGENT);
        ridgesOfMadness.situationsManager.add(smell);

        System.out.println("Группа прошла четверть мили");

        smell.addType(SmellType.UNBEARABLE);

        var gallery = new Gallery();
        ridgesOfMadness.secondaryPlaceManager.enterPlace(gallery);

        ridgesOfMadness.situationsManager.end(steamJet);
        ridgesOfMadness.situationsManager.end(heat);

        System.out.println("Группа увидела одежду, это была \n" + ridgesOfMadness.clothesManager.toString());
        scientists.moveForward();
        ridgesOfMadness.secondaryPlaceManager.increaseCurrentPlace();

        var newSmell = new Smell(SmellType.STRANGE, "какая-нибудь неизвестная разновидность подземных грибов");
        ridgesOfMadness.situationsManager.add(newSmell);

        ridgesOfMadness.mainPlaceManager.increaseCurrentPlace();

        var cave = new Cave(15,23 , "с ровным каменным полом","овальной формы");
        ridgesOfMadness.mainPlaceManager.changePlace(cave);

        ridgesOfMadness.secondaryPlaceManager.increaseCurrentPlace();

        var mist = new Mist();
        ridgesOfMadness.situationsManager.add(mist);


    }
    private RidgesOfMadness ridgesOfMadness;
}
