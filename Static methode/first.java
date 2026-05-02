class student {
    int id;
    String name;
    static String collage = "Rungta";

    student(int id, String name){
        this.id = id;
        this.name = name;

    }

    void display(){
        System.out.println("ID :" + id + " " + "Name" + " " + name + " " + collage);
    }
}
public class first {
    public static void main(String[] s){
    student s1 =new student(101,"panku");
    student s2 =new student(102,"Royal");

    s1.display();
    s2.display();

    }
}
