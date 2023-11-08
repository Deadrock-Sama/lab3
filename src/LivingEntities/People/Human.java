package LivingEntities.People;

public class Human {

    final private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
