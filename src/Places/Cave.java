package Places;

public class Cave extends Place {

    public Cave(int width, int length, String floor, String shape){
        this.floor = floor;
        this.width = width;
        this.length = length;
        this.shape = shape;
    }

    @Override
    public String toString() {

        return String.format("пещера длиной %d метр, шириной %d метров %s %s", length, width, shape, floor);

    }

    @Override
    protected void appear() {
        System.out.println("Перед группой открылась " + toString());

    }

    @Override
    protected void disappear() {
        System.out.println("Группа удалилилась из пещеры");
    }


    private int width;
    private int length;
    private String floor;
    private String shape;
}
