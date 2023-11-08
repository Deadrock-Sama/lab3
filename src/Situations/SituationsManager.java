package Situations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SituationsManager {

    public SituationsManager() {

        situations.put("heat", new ArrayList<>());
        situations.put("mist", new ArrayList<>());
        situations.put("smell", new ArrayList<>());
        situations.put("steamJet", new ArrayList<>());

    }


    public void add(Situation situation) {

        addWithoutStart(situation);
        situation.start();

    }

    public void addWithoutStart(Situation situation) {

        var situationfOfType = situations.get(situation.toString());

        boolean contains = Arrays.stream(situationfOfType.toArray()).anyMatch(sit -> sit.equals(situation));
        if (contains)
            return;

        situationfOfType.add(situation);

    }


    public void end(Situation situation) {

        var situationfOfType = situations.get(situation.toString());

        if (!situationfOfType.contains(situation))
            return;

        situation.end();
        situationfOfType.remove(situation);

    }


    private HashMap<String, ArrayList<Situation>> situations = new HashMap<String, ArrayList<Situation>>();


}
