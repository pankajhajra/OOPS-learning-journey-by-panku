class Animal{
    void eat(){
        System.out.println("Animals sounds good");
    }
}
class Dog extends Animal{  
    void sound (){
    System.out.println(" Dog is barking !");
    }
}


public class first{
 public static void main(String[]s){
      Dog d = new Dog();
    d.sound();
    d.eat();
 }    
}
