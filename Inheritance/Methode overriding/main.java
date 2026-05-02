class Animal{
    void sound(){
     System.out.println("Dog barks like lion");
    }
}
class lion extends Animal{
    @Override
    void sound(){
        System.out.println("Lion has real roar ! ");
    }
}
public class main {
    public static void main(String[]s){
        Animal a = new lion();
        a.sound();  
    }
}
