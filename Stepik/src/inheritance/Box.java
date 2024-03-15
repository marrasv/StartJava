package inheritance;

public class Box {
    private double length;
    private  double width;
    private double height;

    public  Box(){
        this(10);
    }

    public Box(Box another){
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size){
        this(size,size,size);
    }

    public Box copy(){
        return new Box(this.length, this.width, this.height);
    }

    public void showInfo(){
        System.out.println("length = " +  this.length + ", width = " + this.width + ", height = " + this.height);
    }
}
