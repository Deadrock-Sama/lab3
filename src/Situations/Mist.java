package Situations;

public class Mist extends Situation{

    @Override
    public void start() {
        System.out.println("Обзор преграждала таинственная мгла");
        super.start();
    }

    @Override
    public void end() {
        System.out.println("Таинственная мгла начала рассеиваться");
    }

    @Override
    public String toString() {
        return "mist";
    }
}
