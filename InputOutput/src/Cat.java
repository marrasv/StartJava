import java.io.Serializable;

public class Cat implements Serializable {
    private String nickName;
    private String breed;
    private  int weight;

    public Cat(String nickName, String breed, int weight) {
        this.nickName = nickName;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickName='" + nickName + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
