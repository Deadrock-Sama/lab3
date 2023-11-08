package Places;

public class Gallery extends Place
implements IIncreasable{

    @Override
    protected void appear() {
        System.out.println("Группа проходила мимо боковых галерей");
    }

    @Override
    protected void disappear() {
        System.out.println("Боковые галлереи закончились");
    }

    public void increase() {
        System.out.println("Размеры боковых галерей резко увеличились");
    }
}
