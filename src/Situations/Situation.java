package Situations;

abstract public class Situation {

    protected void start() {
        started = true;
    }

    abstract protected void end();
    private boolean started = false;


}
