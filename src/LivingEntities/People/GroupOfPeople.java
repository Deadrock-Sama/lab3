package LivingEntities.People;

import java.util.ArrayList;

abstract class GroupOfPeople {

    private ArrayList<Human> group = new ArrayList<>();

    public void addHuman(Human human) {
        if (!group.contains(human))
        {
            group.add(human);
            System.out.println(human.toString() + " присоеденился к группе");
        }

    }

    public void moveForward() {
        System.out.println("Группа двигалась вперед");
    }


}
