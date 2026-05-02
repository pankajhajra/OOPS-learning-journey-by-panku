class lion{
    void sound(){
        System.out.println("Lion Roar is very Heavy ");
    }
}
class tiger extends lion {
    @Override
    void sound(){
        System.out.println("Tiger has good Fighting strategy!");
    }
}
public class first {
    public static void main(String[]s){
    lion a = new tiger();
    a.sound();

    }    
}
