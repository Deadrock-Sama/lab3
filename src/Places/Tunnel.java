package Places;

public class Tunnel extends Place
implements IIncreasable{


    @Override
    protected void appear() {
        System.out.println("Группа шла по туннелю");
    }

    @Override
    protected void disappear() {
        System.out.println("Группа вышла из туннеля");
    }

    public void increase() {
        System.out.println("Неожиданно туннель как по волшебству вдруг расширился");
    }
}
