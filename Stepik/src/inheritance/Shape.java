package inheritance;

public abstract class Shape {
    private double a;
    private  double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }
     public  Shape(double a){
        this(a, a);
     }

     public double perim(){
        return a + b;
     }
}
