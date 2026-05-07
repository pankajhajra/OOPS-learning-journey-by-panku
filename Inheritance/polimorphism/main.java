class Shape{
     void type(){
        System.out.println("This is shape");
     }
    }

    class Circle extends Shape{
        @Override
         void type(){
            System.out.println("Shape is circle");
         }
    }
    class Rect  extends  Shape{
        @Override
        void type(){
            System.out.println("Shape is Rectangle");
        }
    }



public class main {
    public static void main(String []s){
     Shape s1 = new Circle();
     s1.type();
     Shape s2 = new Rect();
     s2.type(); 
    }
}
