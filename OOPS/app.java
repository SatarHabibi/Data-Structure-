public class app {

 public static void main(String args[])
 {
    car ner =new car();
    
    System.out.println(ner.name);
    System.out.println(ner.color);
    System.out.println(ner.model);

ner.drive();
ner.brike();
    
 }
}
class car{
    String model="BMW";
    String name="Fourner";
    String color="white";

    public void drive()
    {
        System.out.println("Car is moving...!");
    }
    public void brike()
    {
        System.out.println("Car is Stoping...!");
    }
}
