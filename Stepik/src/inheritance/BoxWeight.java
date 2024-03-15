package inheritance;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight() {
        this(10, 10, 10, 10);
    }

    public BoxWeight(BoxWeight another) {
        super();
        another.weight = this.weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        this(size, size, size, weight);
    }

    @Override
    public Box copy() {
        return super.copy();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("weight = " + weight);
    }
}
