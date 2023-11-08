package LivingEntities.People;

public class Kidnappers extends GroupOfPeople {

        public Kidnappers(boolean useDefaultData) {
            if(useDefaultData) {
                System.out.println("Образовалась группа бандитов");
                addHuman(new Human("Иваныч"));
                addHuman(new Human("Курага"));
                addHuman(new Human("Капуста(квашеная)"));
            }

        }



}
