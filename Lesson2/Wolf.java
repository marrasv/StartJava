public class Wolf{

    private boolean sex; // true = man
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    
    public void setSex(boolean sex){
        this.sex = sex;
    }

    public boolean getSex(){
        return sex;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setAge(int age){
        if (age > 8){
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }


    public void goToSW(){
        System.out.println("go to somewhere");
    }

    public void sitDown(){
        System.out.println("sit down");
    }

    public void runToSW(){
        System.out.println("run to somewhere");
    }

    public void howl(){
        System.out.println("howl");
    }

    public void hunt(){
        System.out.println("hunt");
    }
    
}