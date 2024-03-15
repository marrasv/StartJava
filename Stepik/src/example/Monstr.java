package example;

public class Monstr {
    int numEye;
    int numArm;
    int numLeg;
    Monstr(){
        this(10);
    }

    public Monstr(int numEye, int numArm, int numLeg) {
        this.numEye = numEye;
        this.numArm = numArm;
        this.numLeg = numLeg;
    }

    public Monstr(int num){
        this(num, num, num);
    }

    public void voice(){
        this.voice(1);
    }

    public void voice(int num){
        this.voice(num, "Grrrrrr....." );
    }

    public void voice(int num, String text){
        for(int i = 1; i<=num; i++) {
            System.out.println(text);
        }
    }
    public Monstr copy(){
        return new Monstr(2*this.numEye,2*this.numArm, 2*this.numLeg);
    }
    public void showInfoMonstr(){
        System.out.println("Eyes: " + numEye + "\nArms: " + numArm + "\nLegs: " + numLeg);
    }
}

