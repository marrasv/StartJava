import java.util.Arrays;
public class Player {

    private String name;
    public int sumAttempt;


    public static final int ATTEMPT_MAX = 10;
    public int[] arrayOfNumbers = new int[ATTEMPT_MAX];


    public Player (String name){
        this.name = name;
        //int sumAttempt = 0;
    }

    public String getName(){
        return name;
    }

}
