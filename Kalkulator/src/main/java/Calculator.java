public class Calculator {
    public double add(double a, double b){
        return a + b;
    }
    public double add(String a, String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA + numB;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
        return a / b;
    }

    public double pow(double a, double b){
        return Math.pow(a, b);
    }

    public double multiply(double a){
        return a * a;
    }
}
