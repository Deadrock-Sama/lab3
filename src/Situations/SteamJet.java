package Situations;

public class SteamJet extends Situation{
    @Override
    protected void start() {

        System.out.println("Появились струйки пара");
        super.start();

    }

    @Override
    protected void end() {
        System.out.println("Струйки пара исчезли");
    }

    @Override
    public String toString() {
        return "steamJet";
    }
}
