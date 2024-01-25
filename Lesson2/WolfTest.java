public class WolfTest{
    public static void main(String[] args) {
        Wolf barsik = new Wolf();
        barsik.setSex(true);
        barsik.setName("Barsik");
        barsik.setWeight(40);
        barsik.setAge(18);
        barsik.setColor("grey");
        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());
        System.out.println(barsik.getWeight());
        System.out.println(barsik.getColor());
        if (barsik.getSex()){
            System.out.println("männlich");
        } else{
            System.out.println("weiblich");
        }
        barsik.howl();
       }    
  }

