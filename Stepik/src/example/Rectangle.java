package example;

public class Rectangle {
    double length;
    double width;

    void setDimension (int length, int width){
        this.length = length;
        this.width = width;
    }

    double getSquare(){
        return length * width;
    }
}
