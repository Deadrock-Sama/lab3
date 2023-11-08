package LivingEntities.People;

public class Scientists extends GroupOfPeople{

    public Scientists(Boolean useDefaultData) {
        if (useDefaultData) {
            System.out.println("Образовалась группа ученых");
            addHuman(new Human("Попугайкин"));
            addHuman(new Human("Тыдышкин"));
            addHuman(new Human("Комеркин"));
        }

    }
}
