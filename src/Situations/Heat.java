package Situations;

public class Heat extends Situation{

    @Override
    public void start() {
        System.out.println("Становилось все жарче");
        super.start();
    }

    @Override
    public void end() {
        System.out.println("Температура теперь всюду выровнялась");
    }

    @Override
    public String toString() {
        return "heat";
    }

}
