abstract class Animal{
   abstract void sound();
}

class Dog extends Animal{
    void sound(){
        System.out.println("Lion sound razy also dogs");
    }

}

public class first {
public static void main(String[] s) {
    Dog d = new Dog();
    d.sound();
}    
}
