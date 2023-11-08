package Situations;

import java.util.ArrayList;
import java.util.HashMap;

public class Smell extends Situation {

    private ArrayList<SmellType> types = new ArrayList<>();
    private String source = "";
    private HashMap<SmellType, String> typesStrings = new HashMap<>() {};
    public Smell(SmellType type) {
        types.add(type);
        typesStrings.put(SmellType.PUNGENT, "едкий");
        typesStrings.put(SmellType.STRANGE, "непонятный");
        typesStrings.put(SmellType.UNBEARABLE, "нестерпимым");
    }


    public Smell(SmellType type, String source) {
        this(type);
        this.source = source;
    }
    @Override
    protected void start() {
        System.out.println("Cтоял " + getSmellDesсription());
        super.start();
    }

    public void addType(SmellType type) {

        if (types.contains(type))
            return;

        String oldDesc = getSmellDesсription();
        types.add(type);
        String newDesc = getSmellDesсription();
        oldDesc = oldDesc.substring(0, 1).toUpperCase() + oldDesc.substring(1);
        System.out.println(oldDesc + " превратился в " + newDesc);

    }

    @Override
    protected void end() {
        System.out.println(getSmellDesсription() + " исчез");
    }

    private String getSmellDesсription() {

        String res = "";

        for(SmellType st: types) {

            res+= typesStrings.get(st) + " ";

        }

        res += "запах";

        if (!source.isEmpty()) {
            res += ", источником которого была " + source;
        }

        return res;

    }

    @Override
    public String toString() {
        return "smell";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && (((Smell)obj).types == types);
    }
}
